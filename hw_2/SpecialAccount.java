package hw_2;

/**
 * This class extends from Account class it is used only to create an special account 
 * @author Mahmoud Abd Elghany
 * @version 1.0
 * @since 2021-4-29
 */
public class SpecialAccount extends Account {
    /**
     * parameterize constructor special account to set value of balance
     * @param balan account balance
     */
    public SpecialAccount(double balan) {
        setAccountnumber(accounts_num);
        setBalance(balan);
        accounts_num++;
    }
    
    /**
     * This function to withdraw from balance
     * @param out reduce the balance
     */
    @Override
    public void Withdraw(double out) {
        if (out > getBalance() && out <= getBalance() + 1000) {
            setBalance(getBalance() - out);
        } else if (out < getBalance()) {
            setBalance(getBalance() - out);
        } else {
            System.out.println("Error in the checkout process");
        }
    }
    /**
     * This function returns all the special account data
     * @return special account data
     */
    @Override
    public String toString() {
        return "SpecialAccount{"
                + "accountnumber='" + getAccountnumber() + '\''
                + ", balance=" + getBalance()
                + '}';
    }
}
