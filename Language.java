
/**
 * Abstract class LanguageStrategy - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Language
{

    abstract void showBill();
    abstract void showOpenCustomerInfo(Customer customer);
    abstract void showOpenAccountInfo(Account acc);
    abstract void showChangeLanguageInfo();
    abstract void showDepositError();
    abstract void showGetBalance(double price);
    abstract void showGetBalanceError();
}
