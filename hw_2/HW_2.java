package hw_2;
import java.util.Scanner;

/**
 * This is the main class
 * @author Pheobe,kerllose,Mahmoud
 * @version 1.0
 * @since 2021-4-29
 */
public class HW_2 {

    static Client cl;
    static Client cl1;
    static Scanner input = new Scanner(System.in);
    static Scanner in = new Scanner(System.in);
    static Scanner inp = new Scanner(System.in);
    static int choice, Choice;
    static double bal;
    static double bal1;
    static String Bankname, Bankaddress, Bankphone;
    static Bank bank1;

    /**
     * This is method to display option to the user
     */
    public static void bank() {
        System.out.println("Please enter bank's name\nBanka's address\nBank's phone");
        Bankname = inp.nextLine();
        Bankaddress = inp.nextLine();
        Bankphone = inp.nextLine();
        bank1 = new Bank(Bankname, Bankaddress, Bankphone);
        System.out.println("Welcome we wish you a good day");
        while (true) {
            System.out.println("Menu:\n1-New client\n2-Print all clients\n3-Print all accounts\n4-Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    NewClient();
                    break;
                case 2:
                    bank1.displayClients();
                    break;
                case 3:
                    bank1.displayAccounts();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }
        }
    }

    /**
     * This function to add a new client and its account information
     */
    public static void NewClient() {
        System.out.println("1-Sign for normal client\n2-Sign for commercial client");
        String name, address, national_id, phone, commercial_id;
        choice = input.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Please enter the name,national_id ,address ,phone");
                name = in.nextLine();
                national_id = in.nextLine();
                address = in.nextLine();
                phone = in.nextLine();
                System.out.println("1- Normal Account \n2- Special Account");
                Choice = input.nextInt();
                System.out.println("Enter account balanc");
                bal = input.nextDouble();
                cl = new Client(name, national_id, address, phone, account(Choice, bal));
                System.out.println("The data has been successfully registered");
                bank1.Add(cl.getAccount());
                bank1.Add(cl);
                balOptions(cl.getAccount());
                break;
            }

            case 2: {
                System.out.println("Please enter the name, address ,phone ,commercial id");
                name = in.nextLine();
                address = in.nextLine();
                phone = in.nextLine();
                commercial_id = in.nextLine();
                System.out.println("1- Normal Account \n2- Special Account");
                Choice = input.nextInt();
                System.out.println("Enter account balanc");
                bal = input.nextDouble();
                cl1 = new CommercialClient(name, address, phone, account(Choice, bal), commercial_id);
                System.out.println("The data has been successfully registered");
                bank1.Add(cl1);
                bank1.Add(cl1.getAccount());
                balOptions(cl1.getAccount());
                break;
            }
        }
    }

    /**
     * This method to select the type of account (account or special account)
     *
     * @param Choice the choice of type's account
     * @param Bal the value of account's balance
     * @return type of account
     */
    public static Account account(int Choice, double Bal) {
        switch (Choice) {
            case 1: {
                Account ac = new Account(Bal);
                return ac;
            }
            case 2: {
                Account ac1 = new SpecialAccount(Bal);
                return ac1;
            }
            default: {
                return null;
            }
        }
    }

    /**
     * This method is for making changes to the the account, such as withdrawals
     * and deposits
     *
     * @param Acc type of account
     */
    public static void balOptions(Account Acc) {
        int i = 0;
        while (i == 0) {
            System.out.println("1- Withdrawal \n2- Deposit \n3- Balance inquiries\n4- Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println(Acc.toString());
                    System.out.println("What balance ?");

                    bal1 = input.nextDouble();
                    Acc.Withdraw(bal1);
                    System.out.println(Acc.toString());
                    break;
                }
                case 2: {
                    System.out.println(Acc.toString());
                    System.out.println("What balance ?");

                    bal1 = input.nextDouble();
                    Acc.deposite(bal1);
                    System.out.println(Acc.toString());
                    break;
                }
                case 3: {
                    System.out.println(Acc.toString());
                    break;
                }
                case 4: {
                    System.out.println("Exit");
                    i++;
                    break;
                }
                default:
                    System.out.println("Wrong choice!");
                    break;
            }
        }
    }

    /**
     * This is main function
     *
     * @param args the command line argument
     */
    public static void main(String[] args) {
        bank();
    }
}

