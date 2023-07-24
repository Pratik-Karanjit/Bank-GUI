
/**
 * Write a description of class BankCard here.
 *
 * @author (22067545 Pratik Karanjit)
 * @version (1.0.0)
 */
public class BankCard
{
    //attributes-all attributes must be private
    private int card_id;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;

    //Constructor-it must be public
    public BankCard(double balanceAmount, int card_id, String bankAccount,String issuerBank) 
    {
        this.balanceAmount = balanceAmount;
        this.card_id = card_id;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
        //Assigning empty string to clientName
        this.clientName = "";

    }

    //setter method
    public void setClientName(String newclientName) {
        clientName = newclientName;
    }

    public void setBalanceAmount(double newbalanceAmount) {
        balanceAmount = newbalanceAmount;
    }

    //accessor method
    public int getcard_id(){
        return this.card_id;
    }

    public String getIssuerBank() {
        return this.issuerBank;
    }

    public String getBankAccount() {
        return this.bankAccount;
    }

    public double getBalanceAmount() {
        return this.balanceAmount;
    }

    //accessor method for clientName
    public String getclientName(){
        return this.clientName;
    }

    //display method-return type will be void as it won't return anything
    public void display() {
        System.out.println("Card ID: "+ this.card_id);
        System.out.println("Issuer Bank: "+ this.issuerBank);
        System.out.println("Bank Account: "+ this.bankAccount);
        System.out.println("Balance Amount: "+ this.balanceAmount);
        if(clientName != " "){
            System.out.println("Client Name: "+ this.clientName);
        }
        else{
            System.out.println("Client name is not assigned");
        }
    }
}

