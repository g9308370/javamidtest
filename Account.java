
/**
 * Write a description of class Account here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Account
{
    public String accnum;
    public String customer_ID;
    public static String language="English";
    //public String Date date;
    public String cointype;
    public double balance;
    private  Transactions ts;
    public Account(String accnum,String customer_ID,String cointype,double balance){
     this.accnum=accnum;
     this.customer_ID=customer_ID;
     this.cointype=cointype;
     this.balance=balance;
     ts=new Transactions();
    }
    public Account(){
       ts=new Transactions();
    }

  public boolean withdraw(){

    return true;
   }
  public boolean deposit(double price,String language){
    ts.recordBill();
    System.out.printf("Language = "+language+"\n");
    ts.showBill(language);
    return true;
  }
     public boolean trasferIn(){

       return true;
   }
     public boolean trasferOut(){
 return true;
   }
   public double getBalance(){
 return 0;
    }
   
}