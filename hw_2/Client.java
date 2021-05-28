package hw_2;


/**
 * This is client class it is used to create clients for bank
 * @author Kerllose
 * @version 1.0
 * @since 2021-4-29
 */
public class Client {

    private String name;
    private String nationalID;
    private String address;
    private String phone;
    private Account account;

    /**
     * Constructs a client with no data
     */
    public Client() {
        this.name = null;
        this.nationalID = null;
        this.address = null;
        this.phone = null;
        this.account = null;
    }

    /**
     * Constructs a client with name ,national id ,address ,phone number ,account
     * @param name client name
     * @param nationalID client national id
     * @param address client address
     * @param phone client phone number
     * @param account client account
     */
    public Client(String name, String nationalID, String address, String phone, Account account) {
        this.name = name;
        this.nationalID = nationalID;
        this.address = address;
        this.phone = phone;
        this.account = account;
    }

    /**
     * This function returns the client name
     * @return the client name
     */
    public String getName() {
        return name;
    }

    /**
     * This function sets the clients name
     * @param name client name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This function returns the client national id
     * @return client national id
     */
    public String getNationalID() {
        return nationalID;
    }

    /**
     * This function sets the client national id
     * @param nationalID client national id
     */
    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    /**
     * This function returns the client address
     * @return client address
     */
    public String getAddress() {
        return address;
    }

    /**
     * This function sets the client address
     * @param address client address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This function return the client phone number
     * @return client phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This function sets the client phone number
     * @param phone client phone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * This function returns the client account
     * @return client account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * This function sets the client account
     * @param account client account
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * This function returns all the client data as a string
     * @return client data
     */
    public String toString() {
        return "Client{"
                + "name='" + name + '\''
                + ", nationalID=" + nationalID
                + ", address='" + address + '\''
                + ", phone=" + phone
                + "," + account
                + '}';
    }
}
