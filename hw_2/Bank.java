package hw_2;

import java.util.*;
/**
 * This is a bank that have its own accounts and clients also can add a client or account and
 * can show the data of the bank(all clients and all accounts)
 *@author phoebe george
 *@version 1.0
 *@since 2021-4-29
 */
public class Bank {

    private String name;
    private String address;
    private String phone_no;
    private ArrayList<Client> list = new ArrayList<Client>();
    private ArrayList<Account> list2 = new ArrayList<Account>();
    /**
     * This constructor is  default
     */
    public Bank() {
        name = null;
        address = null;
        phone_no = null;
    }

    /**
     * This constructor take three parameters (name , address ,phone_no )
     * @param name set the name of the bank
     * @param address set the address of the bank
     * @param phone_no set the bank phone number
     */
    public Bank(String name, String address, String phone_no) {
        this.name = name;
        this.address = address;
        this.phone_no = phone_no;
    }

    /**
     * This function returns the Bank Name
     * @return Bank Name
     */
    public String getName() {
        return name;
    }

    /**
     * This function sets the Bank Name
     * @param name is Bank Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This function returns the Bank Address
     * @return Bank Address
     */
    public String getAddress() {
        return address;
    }

    /**
     * This function sets the Bank Address
     * @param address is Bank Address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This function returns the Bank phone number
     * @return Bank phone number
     */
    public String getPhone_no() {
        return phone_no;
    }

    /**
     * This function sets the Bank phone number
     * @param phone_no is Bank phone number
     */
    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    /**
     * This method  is use to add account to the list of accounts
     * @param account is use to put account in list
     */
    public void Add(Account account) {
        list2.add(account);
    }

    /**
     * This method  is use to add client to the list of clients
     * @param client is use to put the client in list
     */
    public void Add(Client client) {
        list.add(client);
    }

    /**
     * This method  is use to print all the clients that are in client list
     */
    public void displayClients()
    {
        System.out.println(list);
    }

    /**
     * This method  is use to print all the accounts that are in account list
     */
    public void displayAccounts() {

        System.out.println(list2);
    }

}