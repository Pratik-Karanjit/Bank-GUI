
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067545 Pratik Karanjit)
 * @version (1.0.0)
 */

public class CreditCard extends BankCard
{
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;

    //Constructor
    public CreditCard(int card_id,String clientName,String issuerBank,String bankAccount,double balanceAmount,int cvcNumber,double interestRate, String expirationDate)
    {
        //calling constructor from parent class 
        super(balanceAmount,card_id,bankAccount,issuerBank);
        super.setClientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;

        //set flag to false
        this.isGranted = false;
    }

    //accessor methods
    public int getCvcNumber() {
        return this.cvcNumber;
    }

    public double getCreditLimit(){
        return this.creditLimit;
    } 

    public double getInterestRate() {
        return this.interestRate;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    } 

    public int getGracePeriod() {
        return this.gracePeriod;
    } 

    public boolean getIsGranted() {
        return this.isGranted;
    } 

    //Setter Method for credit limit
    public void setCreditLimit(double creditLimit,int gracePeriod) {
        if(creditLimit <= 2.5 * getBalanceAmount()){
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true;
        }else{
            System.out.println("Credit cannot be issued.");
        }
    }

    //CancelCreditCard method
    public void cancelCreditCard() {
        if (isGranted){
            cvcNumber = 0;
            creditLimit = 0;
            gracePeriod = 0;
            isGranted = false;
        }
    }
    //display method
    public void display(){
        super.display();
        if(isGranted == true){
            System.out.println("CVC Number:" +cvcNumber);
            System.out.println("Credit Limit:" +creditLimit);
            System.out.println("Interest Rate:" +interestRate);
            System.out.println("Expiration Date:" +expirationDate);
            System.out.println("Grace Period:" +gracePeriod);
        }
        else{
            System.out.println("CVC number:" +this.cvcNumber);
            System.out.println("Interest Rate:" +this.interestRate);
            System.out.println("Expiration Date:" +this.expirationDate);
        }
    }
}