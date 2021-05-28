package hw_2;


/**
 * This is Account class  is used to create account of clients for bank
 * @author Mahmoud Abd Elghnay
 * @version 1.0
 * @since 2021-4-29
 */
public class Account {
    private int accountnumber;
    private double balance;
    public static int accounts_num = 1;

    /**
     * Default Constructor to set  Account data with initial value =0 
     */
    public Account() {
        this.accountnumber = 0;
        this.balance = 0;
        
    }
    /**
     * parameterize constructor to set value of balance 
     * @param balance account balance
     */
    public Account(double balance) {
        this.accountnumber = accounts_num;
        this.balance = balance;
        accounts_num++;}
    
    /**
     * copy construct to copy data from constructor to other 
     * @param account object of class account
     */
    public Account(Account account)
    {
        this.accountnumber = account.accountnumber;
        this.balance = account.balance;
    }
    /**
     * This function return Account number of client
     * @return account number of client
     */
    public int getAccountnumber() {
        return accountnumber;
    }
    /**
     * This function to assign value to account number
     * @param account_number the number of account of client
     */
    public void setAccountnumber(int account_number) {
        this.accountnumber = account_number;
    }
    /**
     * This function return Account's balance of client
     * @return balance the balance of client
     */
    public double getBalance() {
        return balance;
    }
    /**
     * This function to assign value to balance
     * @param balance the account balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     * This function to add balance
     * @param in over the balance
     */
    public void deposite(double in) {
        this.balance = in + this.balance;
    }
    /**
     * This function to withdraw from balance
     * @param out reduce the balance
     */
    public void Withdraw(double out) {
        if (out > getBalance()) {
            System.out.println("Error in the checkout process");
        } else {
            this.balance = this.balance - out;
        }
    }
    /**
     * This function returns all the account data
     * @return Account data
     */
    @Override
    public String toString() {
        return "Account{"
                + "accountnumber='" + accountnumber + '\''
                + ", balance=" + balance
                + '}';
    }
}
