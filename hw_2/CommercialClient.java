package hw_2;
/**
 * This class` extends from Client class it is used only to create an account for commercial client ( companies )
 * @author Kerllose
 * @version 1.0
 * @since 2021-4-29
 */
public class CommercialClient extends Client {

    private String commercialID;

    /**
     * Constructs a commercial client account with the commercial id
     * @param commercialID the company's commercial id
     */
    public CommercialClient(String commercialID) {
        setName(null);
        setAddress(null);
        setPhone(null);
        setAccount(null);
        this.commercialID = commercialID;
    }

    /**
     * Constructs a commercial client account with name ,address ,phone number ,account and commercial id
     * the national id for companies is set to be 00000000000000
     * @param name the company name
     * @param address the company address
     * @param phone the company phone number
     * @param account the company account
     * @param commercialID the company commercial id
     */
    public CommercialClient(String name, String address, String phone, Account account, String commercialID) {
        setName(name);
        setAddress(address);
        setPhone(phone);
        setAccount(account);
        this.commercialID = commercialID;
    }

    /**
     * This function to return the commercial id of the client
     * @return the commercial id of the client
     */
    public String getCommercialID() {
        return commercialID;
    }

    /**
     * This function to set the client commercial id
     * @param commercialID the client's commercial id
     */
    public void setCommercialID(String commercialID) {
        this.commercialID = commercialID;
    }

    /**
     * This function return all the client's data as a string
     * @return the client's name ,national id ,address ,phone number ,the account data and the commercial id
     */
    @Override
    public String toString() {
        return "Client{"
                + "name='" + getName() + '\''
                + ", nationalID=" + getNationalID()
                + ", address='" + getAddress() + '\''
                + ", phone=" + getPhone()
                + ", account=" + getAccount() + ", CommercialClient{"
                + "commercialID='" + commercialID + '\''
                + '}'
                + '}';
    }
}
