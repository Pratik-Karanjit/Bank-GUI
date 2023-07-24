
/**
 * Write a description of class DebitCard here.
 *
 * @author (22067545 Pratik Karanjit)
 * @version (1.0.0)
 */

public class DebitCard extends BankCard
{
    //attributes
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;

    public DebitCard(double balanceAmount,int cardID,String bankAccount,String issuerBank,String clientName,int pinNumber)
    {
        //calling constructor from parent class
        super(balanceAmount, cardID,bankAccount,issuerBank);

        //setter method
        setClientName(clientName);
        this.pinNumber = pinNumber; 
        this.hasWithdrawn = false; 
    }

    //mutator methods
    public void setWithdrawalAmount(int newWithdrawalAmount){
        withdrawalAmount = newWithdrawalAmount;
    }
    //accessor methods
    public int getPinNumber() {
        return this.pinNumber;
    }

    public int getWithdrawalAmount() {
        return this.withdrawalAmount; 
    }

    public String getDateOfWithdrawal() {
        return this.dateOfWithdrawal;
    }

    public boolean getHasWithdrawn() {
        return this.hasWithdrawn;
    }

    //method accepts=withdrawalAmount,dateOfWithdrawal,pinNumber
    public int withdraw(int withdrawalAmount, String dateOfWithdrawal,int enteredPinNumber)
    {
        if(enteredPinNumber != getPinNumber()){
            System.out.println("PIN number is not correct.");
            return 1;
        }
        else if(withdrawalAmount > super.getBalanceAmount()){
            System.out.println("Balance is not sufficient.");
            return 2;
        }
        else{
            this.withdrawalAmount = withdrawalAmount;
            this.dateOfWithdrawal = dateOfWithdrawal;
            this.hasWithdrawn = true;
            this.setBalanceAmount(super.getBalanceAmount() - withdrawalAmount);
        }
        return 0;
    }

    public void display(){
        super.display();
        if(hasWithdrawn == true){
            System.out.println("PIN-Number:" +pinNumber);
            System.out.println("Withdrawal-Amount:" +withdrawalAmount);
            System.out.println("Date-Of-Withdrawal:" +dateOfWithdrawal);
            System.out.println("Balance Amount:" +getBalanceAmount());
        }
    }
}

