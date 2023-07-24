
/**
 * Write a description of class BankGUI here.
 *
 * @author (22067545 Pratik Karanjit)
 * @version (1.0.0)
 */

//Importing all necessary packages 
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;
public class BankGUI implements ActionListener
{
    //Declaring JFrame private
    private JFrame frame;  

    //Declaring ArrayList private
    private ArrayList<BankCard> list = new ArrayList<BankCard>();

    //Declaring all Debit info private
    private JLabel BankInfoLabel;
    private JLabel DebitInfoLabel;
    private JLabel DebitCardIDLabel;
    private JLabel ClientNameLabel;
    private JLabel BankAccountLabel;
    private JLabel BalanceAmountLabel;
    private JLabel IssuerBankLabel;
    private JLabel PinNumberLabel;
    private JTextField DebitCardIDText;
    private JTextField ClientNameText;
    private JTextField BankAccountText;
    private JTextField BalanceAmountText;
    private JTextField IssuerBankText;
    private JTextField PinNumberText;

    //Declaring all withdraw section private
    private JLabel withdrawalLabel;
    private JLabel withdrawalAmtLabel;
    private JLabel withdrawalDateLabel;
    private JLabel withdrawalPinNumberLabel;
    private JTextField withdrawalAmtText;
    private JTextField withdrawalPinText; 
    private JComboBox dayCombo;
    private JComboBox monthCombo;
    private JComboBox yearCombo;
    private JLabel withdrawIDLabel;
    private JTextField withdrawIDText; 

    //Declaring credit Info section private
    private JLabel creditInfoLabel;
    private JLabel creditIDLabel;
    private JLabel creditClientNameLabel;
    private JLabel creditIssuerBankLabel;
    private JLabel creditBalanceAmtLabel;
    private JLabel creditBankAccLabel;
    private JLabel cvcNumberLabel;
    private JLabel interestRateLabel;
    private JLabel expirationDateLabel;
    private JTextField creditIDText;
    private JTextField creditClientNameText;
    private JTextField creditIssuerBankText;
    private JTextField creditBalanceAmtText;
    private JTextField creditBankAccText;
    private JTextField cancelCreditText; 
    private JTextField cvcNumberText;
    private JTextField interestRateText;
    private JComboBox expDayCombo;
    private JComboBox expMonthCombo;
    private JComboBox expYearCombo;

    //Declaring creditLimit section private
    private JLabel creditLimitLabel;
    private JLabel creditLimit1Label;
    private JLabel gracePeriodLabel;
    private JTextField creditLimitText;
    private JTextField gracePeriodText;

    //Declaring all buttons private
    private JButton clearBtn;
    private JButton displayDebitBtn;
    private JButton addDebitBtn;
    private JButton addCreditBtn;
    private JButton displayCreditBtn;
    private JButton withdrawDebitBtn;
    private JButton setCreditLimitBtn;
    private JButton cancelCreditBtn;
    private JLabel cancelCardID;

    //Creating a BankGUI constructor public and developing the GUI under here
    public BankGUI(){
        //Creating frame for GUI
        JFrame frame = new JFrame("BankGUI");

        //Creating JLabels for Debit Info
        BankInfoLabel = new JLabel("Bank Info");
        DebitInfoLabel = new JLabel("Debit Info");
        DebitCardIDLabel = new JLabel("Card ID:");
        ClientNameLabel = new JLabel("Client Name:");
        BankAccountLabel = new JLabel("Bank Account:");
        BalanceAmountLabel = new JLabel("Balance Amount:");
        IssuerBankLabel = new JLabel("IssuerBank:");
        PinNumberLabel = new JLabel("PinNumber:");

        //Creating JTextFields for Debit Infos 
        DebitCardIDText = new JTextField();
        ClientNameText = new JTextField();
        BankAccountText = new JTextField();
        BalanceAmountText = new JTextField();
        IssuerBankText = new JTextField();
        PinNumberText = new JTextField();

        //Setting Bounds for Debit Info Labels 
        BankInfoLabel.setBounds(607,18,110,31);
        DebitInfoLabel.setBounds(202,95,106,34); 
        DebitCardIDLabel.setBounds(126,169,58,20);
        ClientNameLabel.setBounds(123,215,138,42);
        IssuerBankLabel.setBounds(123,271,138,42); 
        BalanceAmountLabel.setBounds(123,323,138,42);
        BankAccountLabel.setBounds(123,383,98,33); 
        PinNumberLabel.setBounds(123,439,105,37);

        //Setting Bounds for Debit Info TextFields 
        DebitCardIDText.setBounds(240,159,182,33);
        ClientNameText.setBounds(240,215,182,33);
        IssuerBankText.setBounds(240,271,182,33);
        BalanceAmountText.setBounds(240,327,182,33);
        BankAccountText.setBounds(240,383,182,33);
        PinNumberText.setBounds(240,439,182,33);

        //Creating JLabels for Withdraw
        withdrawalLabel = new JLabel("Withdrawal");
        withdrawalAmtLabel = new JLabel("Withdrawal Amount:");
        withdrawalDateLabel = new JLabel("Withdrawal Date:");
        withdrawalPinNumberLabel = new JLabel("PIN Number:");
        withdrawIDLabel = new JLabel("Card ID:");

        //Creating JTextFields and Combo Box for Withdrawal date 
        withdrawalAmtText = new JTextField();
        dayCombo = new JComboBox();

        //Using for loop to set the day combo box
        for (int d = 1; d <=31; d++){
            dayCombo.addItem(d);
        }
        dayCombo.setBounds(263,787,91,31);

        //Creating month combo and using for loop to set it
        monthCombo = new JComboBox();
        for (int g = 1; g <=12; g++){
            monthCombo.addItem(g);
        }
        monthCombo.setBounds(375,787,91,31);

        //Creating year combo and using for loop to set it 
        yearCombo = new JComboBox();
        for (int k = 1920; k <=2023; k++){
            yearCombo.addItem(k);
        }
        yearCombo.setBounds(487,787,91,31);

        //Creating text fields for withdrawal section
        withdrawalPinText = new JTextField();
        withdrawIDText = new JTextField();

        //Setting bounds for Withdrawal Label 
        withdrawalLabel.setBounds(205,590,126,30);
        withdrawIDLabel.setBounds(119,653,105,37);
        withdrawalAmtLabel.setBounds(119,843,136,42);
        withdrawalDateLabel.setBounds(119,784,136,35);
        withdrawalPinNumberLabel.setBounds(119,716,105,37);

        //Setting Bounds for Withdrawal TextFields and combobox
        withdrawalAmtText.setBounds(268,843,182,33);
        withdrawalPinText.setBounds(261,720,182,33);
        withdrawIDText.setBounds(261,653,182,33);

        //Setting JLabels for Credit Info
        creditInfoLabel = new JLabel("Credit Info");
        creditIDLabel = new JLabel("Card ID:");
        creditClientNameLabel = new JLabel("Client Name:");
        creditIssuerBankLabel = new JLabel("Issuer Bank:");
        creditBalanceAmtLabel = new JLabel("Balance Amount:");
        creditBankAccLabel = new JLabel("Bank Account:");
        cvcNumberLabel = new JLabel("CVC Number:");
        interestRateLabel = new JLabel("Interest Rate:");
        expirationDateLabel = new JLabel("Expiration Date:");

        //Setting JTextFields for Credit Info
        creditIDText = new JTextField();
        creditClientNameText = new JTextField();
        creditIssuerBankText = new JTextField();
        creditBalanceAmtText = new JTextField();
        creditBankAccText = new JTextField();
        cvcNumberText = new JTextField();
        interestRateText = new JTextField();
        cancelCreditText = new JTextField();

        //Creating expDayCombo and using for loop to set it
        expDayCombo = new JComboBox();
        for (int i = 1; i <=31; i++){
            expDayCombo.addItem(i);
        }
        expDayCombo.setBounds(1049,351,91,31);

        //Creating expMonthCombo and using for loop to set it
        expMonthCombo = new JComboBox();
        for (int j = 1; j <=12; j++){
            expMonthCombo.addItem(j);
        }
        expMonthCombo.setBounds(1153,352,91,31);

        //Creating expYearCombo and using for loop to set it
        expYearCombo = new JComboBox();
        for (int h = 1920; h <=2023; h++){
            expYearCombo.addItem(h);
        }
        expYearCombo.setBounds(1257,352,91,31);

        //Setting Bounds for JLabel of Credit Info
        creditInfoLabel.setBounds(864,95,110,27);
        creditIDLabel.setBounds(565,175,58,35);
        creditClientNameLabel.setBounds(565,231,84,27);
        creditIssuerBankLabel.setBounds(565,288,138,38);
        creditBalanceAmtLabel.setBounds(565,336,108,38);
        creditBankAccLabel.setBounds(928,177,96,22);
        cvcNumberLabel.setBounds(928,224,138,38);
        interestRateLabel.setBounds(928 ,288,138,38);
        expirationDateLabel.setBounds(928,351,108,34);

        //Setting bounds for JText Field of Credit Info
        creditIDText.setBounds(678,175,182,34);
        creditClientNameText.setBounds(678,231,182,34);
        creditIssuerBankText.setBounds(678,288,182,34);
        creditBalanceAmtText.setBounds(678,340,182,34);
        creditBankAccText.setBounds(1040,165,182,34);
        cvcNumberText.setBounds(1040,224,182,34);
        interestRateText.setBounds(1040,288,182,34);
        cancelCreditText.setBounds(814,843,117,34);

        //Adding all Labels to frame 
        frame.add(creditInfoLabel);
        frame.add(creditIDLabel);
        frame.add(creditClientNameLabel);
        frame.add(creditIssuerBankLabel);
        frame.add(creditBalanceAmtLabel);
        frame.add(creditBankAccLabel);
        frame.add(cvcNumberLabel);
        frame.add(interestRateLabel);
        frame.add(expirationDateLabel);

        //Adding all the textfields and combo box of credit info 
        frame.add(creditIDText);
        frame.add(creditClientNameText);
        frame.add(creditIssuerBankText);
        frame.add(creditBalanceAmtText);
        frame.add(creditBankAccText);
        frame.add(cvcNumberText);
        frame.add(interestRateText);
        frame.add(expYearCombo);
        frame.add(expDayCombo);
        frame.add(expMonthCombo);

        //Creating label for credit limit section
        creditLimitLabel = new JLabel("Credit Limit");
        creditLimit1Label = new JLabel("Credit Limit:");
        gracePeriodLabel = new JLabel("Grace Period:");

        //Creating JTextFields for credit limit section
        creditLimitText = new JTextField();
        gracePeriodText = new JTextField();

        //Setting bounds for Credit Limit Section
        creditLimitLabel.setBounds(846,505,126,30);
        creditLimit1Label.setBounds(764,571,138,37);
        gracePeriodLabel.setBounds(764,634,138,37);

        //Setting bounds for textfields of credit limit 
        creditLimitText.setBounds(878,571,182,33);
        gracePeriodText.setBounds(878,634,182,33);

        //Adding it to the frames
        frame.add(creditLimitLabel);
        frame.add(creditLimit1Label);
        frame.add(gracePeriodLabel);
        frame.add(creditLimitText);
        frame.add(gracePeriodText);
        frame.add(cancelCreditText);

        //Creating all JButtons here
        displayDebitBtn = new JButton("Display");
        addDebitBtn = new JButton("Add Debit Card");
        addCreditBtn = new JButton("Add Credit Card");
        displayCreditBtn = new JButton("Display");
        withdrawDebitBtn = new JButton("Withdraw");
        setCreditLimitBtn = new JButton("Set Credit Limit");
        cancelCreditBtn = new JButton("Cancel Credit Card");
        clearBtn = new JButton("Clear");
        cancelCardID = new JLabel("Card ID");

        //Settings bounds for all the buttons here
        displayDebitBtn.setBounds(123,518,128,33);
        addDebitBtn.setBounds(298,518,122,33);
        withdrawDebitBtn.setBounds(536,835,142,49);
        displayCreditBtn.setBounds(990,419,128,33);
        addCreditBtn.setBounds(1206,419,142,33);
        setCreditLimitBtn.setBounds(878,698,122,33);
        cancelCreditBtn.setBounds(1004,838,146,44);
        clearBtn.setBounds(1223,843,125,34);
        cancelCardID.setBounds(851,808,90,27); 

        //Adding all the Labels and a display button to the frame
        frame.add(BankInfoLabel);
        frame.add(DebitInfoLabel);
        frame.add(DebitCardIDLabel);
        frame.add(DebitCardIDLabel);
        frame.add(ClientNameLabel);
        frame.add(IssuerBankLabel);
        frame.add(BalanceAmountLabel);
        frame.add(BankAccountLabel);
        frame.add(PinNumberLabel);
        frame.add(withdrawalLabel);
        frame.add(withdrawalAmtLabel);
        frame.add(withdrawalDateLabel);
        frame.add(withdrawalPinNumberLabel);
        frame.add(yearCombo);
        frame.add(dayCombo);
        frame.add(monthCombo);
        frame.add(withdrawIDLabel);
        frame.add(withdrawIDText);

        //Adding all the TextFields to the Frame 
        frame.add(DebitCardIDText);
        frame.add(ClientNameText);
        frame.add(IssuerBankText);
        frame.add(BalanceAmountText);
        frame.add(BankAccountText);
        frame.add(PinNumberText);
        frame.add(withdrawalAmtText);
        frame.add(withdrawalPinText);

        //adding all the buttons here
        frame.add(displayDebitBtn);
        frame.add(addDebitBtn);
        frame.add(withdrawDebitBtn);
        frame.add(displayCreditBtn);
        frame.add(addCreditBtn);
        frame.add(setCreditLimitBtn);
        frame.add(cancelCreditBtn);
        frame.add(clearBtn);
        frame.add(cancelCardID);

        //Setting colors and fonts to the GUI 
        BankInfoLabel.setFont(new Font("Arial", Font.BOLD,20));
        DebitInfoLabel.setFont(new Font("Arial",Font.BOLD,20));
        creditInfoLabel.setFont(new Font("Arial",Font.BOLD,20));
        withdrawalLabel.setFont(new Font("Arial",Font.BOLD,20));
        creditLimitLabel.setFont(new Font("Arial",Font.BOLD,20));

        //Setting colors to different buttons and background
        JPanel GUIPanel = new JPanel();
        GUIPanel.setBackground(new Color(236, 241, 244));
        displayDebitBtn.setBackground(new Color(255,255,255));
        displayCreditBtn.setBackground(new Color(255,255,255));
        addCreditBtn.setBackground(new Color(255,255,255));
        addDebitBtn.setBackground(new Color(255,255,255));
        withdrawDebitBtn.setBackground(new Color(255,255,255));
        setCreditLimitBtn.setBackground(new Color(255,255,255));
        cancelCreditBtn.setBackground(new Color(255,255,255));
        clearBtn.setBackground(new Color(255,255,255));
        expYearCombo.setBackground(new Color(255,255,255));
        expDayCombo.setBackground(new Color(255,255,255));
        expMonthCombo.setBackground(new Color(255,255,255));
        dayCombo.setBackground(new Color(255,255,255));
        monthCombo.setBackground(new Color(255,255,255));
        yearCombo.setBackground(new Color(255,255,255));

        //Setting Panel's bounds for color and adding it to the frame
        GUIPanel.setBounds(0 ,0 , 1440, 940);
        frame.add(GUIPanel);

        //Setting Frame size,layout,Close operator and visible boolean
        //Connecting event listener to all the sources
        clearBtn.addActionListener(this); 
        cancelCreditBtn.addActionListener(this);
        setCreditLimitBtn.addActionListener(this);
        withdrawDebitBtn.addActionListener(this);
        displayCreditBtn.addActionListener(this);
        addCreditBtn.addActionListener(this);
        displayDebitBtn.addActionListener(this);
        addDebitBtn.addActionListener(this);
        frame.setSize(1440,940);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    //Implementing ActionEvent and creating all the necessary buttons under this method 
    public void actionPerformed(ActionEvent e){
        //When the clearBtn is pressed, the event is triggered and the code under if statement is executed
        if(e.getSource() == clearBtn){
            //Setting all the text fields to an empty string when clearBtn event is called
            DebitCardIDText.setText("");
            ClientNameText.setText("");
            BankAccountText.setText("");
            BalanceAmountText.setText("");
            IssuerBankText.setText("");
            PinNumberText.setText("");
            withdrawalAmtText.setText("");
            withdrawalPinText.setText("");
            creditIDText.setText("");
            creditClientNameText.setText("");
            creditIssuerBankText.setText("");
            creditBalanceAmtText.setText("");
            creditBankAccText.setText("");
            cvcNumberText.setText("");
            interestRateText.setText("");
            creditLimitText.setText("");
            gracePeriodText.setText("");

            //Clearing Combo box of expiration date
            expDayCombo.setSelectedItem(1);
            expMonthCombo.setSelectedItem(1);
            expYearCombo.setSelectedItem(1920);

            //Clearing Combo box of withdrawal
            dayCombo.setSelectedItem(1);
            monthCombo.setSelectedItem(1);
            yearCombo.setSelectedItem(1920);
        }

        //When the addDebitBtn is pressed, the event is triggered and the code under if statement is executed
        if(e.getSource() == addDebitBtn){
            //Checking if any of the Debit text field is empty
            if(DebitCardIDText.getText().equals("") || ClientNameText.getText().equals("")|| IssuerBankText.getText().equals("")||BankAccountText.getText().equals("")||BalanceAmountText.getText().equals("")||PinNumberText.getText().equals("")){
                JOptionPane.showMessageDialog(frame, "Please fill all the TextFields.");
            }
            else{
                //Initializing the getText() into respective variables
                int ID = 0;
                String Name = ClientNameText.getText();
                String Issuer_Bank = IssuerBankText.getText().toString();
                String Bank_Account = BankAccountText.getText();
                int BalanceAmt = 0;
                int Pin_Number = 0;
                try{
                    //Convering string into integer using Integer.parseInt
                    ID = Integer.parseInt(DebitCardIDText.getText());
                    BalanceAmt = Integer.parseInt(BalanceAmountText.getText());
                    Pin_Number = Integer.parseInt(PinNumberText.getText());
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(frame, "Please fill correctly");
                    return;
                }
                if (list.isEmpty()){
                    //Storing debitcard in bankcard obj 
                    BankCard obj = new DebitCard(BalanceAmt,ID, Bank_Account, Issuer_Bank, Name, Pin_Number);
                    //Adding obj to the array list 
                    list.add(obj);
                    JOptionPane.showMessageDialog(frame, "Added Successfully");
                    return;
                }
                for (BankCard bankcard: list){
                    //Error checking for existing card ID
                    if(bankcard instanceof DebitCard && ID == bankcard.getcard_id()){
                        JOptionPane.showMessageDialog(frame, "Existing Card ID found.");
                        return;
                    }
                }
                //Storing debitcard in bankcard obj
                BankCard obj = new DebitCard (ID ,BalanceAmt,Name, Issuer_Bank, Bank_Account,  Pin_Number);
                //Adding obj to the array list 
                list.add(obj);
                JOptionPane.showMessageDialog(frame, "Added Successfully");
                return;
            }
        }

        //When the displayDebitBtn is pressed, the event is triggered and the code under if statement is executed
        if(e.getSource() == displayDebitBtn){
            for(BankCard obj: list){
                //Checking if obj is instanceof DebitCard
                if(obj instanceof DebitCard){
                    //downcast
                    ((DebitCard) obj).display();
                }
            }
        }

        //When the addCreditBtn is pressed, the event is triggered and the code under if statement is executed
        if (e.getSource() == addCreditBtn){
            try{
                //Initializing getText() texts to respective variables 
                int cardID = Integer.parseInt(creditIDText.getText());
                String clientName = creditClientNameText.getText();
                String issuerBank = creditIssuerBankText.getText();
                String bankAccount = creditBankAccText.getText();
                double balanceAmount = Integer.parseInt(creditBalanceAmtText.getText());
                int cvcNumber = Integer.parseInt(cvcNumberText.getText());
                int interestRate = Integer.parseInt(interestRateText.getText());
                String day = expDayCombo.getSelectedItem().toString();
                String month = expMonthCombo.getSelectedItem().toString();
                String year = expYearCombo.getSelectedItem().toString();
                String expDate = day+ "/" + month +"/"+year;

                CreditCard creditCard = new CreditCard(cardID,clientName, issuerBank, bankAccount, balanceAmount, cvcNumber, interestRate, expDate);
                boolean check = false;
                for (BankCard obj: list){
                    //Checking if obj is not instanceof CreditCard
                    if (!(obj instanceof CreditCard)){
                        check = true;
                        continue;
                    }
                    if (((CreditCard)obj).getcard_id() == cardID){
                        JOptionPane.showMessageDialog(null, "Existing card ID found.");
                        check = false;
                        break;
                    }
                    else{
                        check = true;
                    }
                }
                if((list.isEmpty()) || (check)){
                    list.add(creditCard);
                    JOptionPane.showMessageDialog(null, "Added successfully");
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Please enter valid data.");
            }
        }   

        //When the displayCreditBtn is pressed, the event is triggered and the code under if statement is executed
        if(e.getSource() == displayCreditBtn){
            for(BankCard Cdt:list){
                //Checking if Cdt is instanceof CreditCard
                if(Cdt instanceof CreditCard){
                    Cdt.display();
                }
            }
        }
    
        //When the withdrawDebitBtn is pressed, the event is triggered and the code under if statement is executed
        if(e.getSource() == withdrawDebitBtn){
            try{
                //Initializing getSelectedItem() to their respective variables
                boolean test = false;
                int cardID = Integer.parseInt(withdrawIDText.getText());
                String day = dayCombo.getSelectedItem().toString();
                String month = monthCombo.getSelectedItem().toString();
                String year = yearCombo.getSelectedItem().toString();
                String date = day+"/"+month+"/"+year; 
                int balanceAmount = Integer.parseInt(withdrawalAmtText.getText());
                int pinNumber = Integer.parseInt(withdrawalPinText.getText());
                for (BankCard obj: list){
                    //Checking if obj is type of Debit or Credit
                    if (!(obj instanceof DebitCard)) {
                        continue;
                    }
                    //Checking if cardID matches
                    if (obj.getcard_id() == cardID){
                        test = true;
                        int with = ((DebitCard)obj).withdraw(balanceAmount, date, pinNumber);
                        if(with == 1){
                            JOptionPane.showMessageDialog(null, "Incorrect PIN Number.");
                        }
                        else if(with == 2){
                            JOptionPane.showMessageDialog(null, "Balance not sufficient.");
                        }
                        else if(with == 0){
                            JOptionPane.showMessageDialog(null, "Withdraw successful");
                        }
                    }
                }
                // Checking if DebitCard info is added 
                if(list.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Invalid. Make sure that you have inserted a debit Card.");
                }
                if (! test) {
                    JOptionPane.showMessageDialog(null, "Card ID not found.");
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid. Make sure that you have inserted correct data or every text field is filled.");
            }
        }
        
        //When the setCreditLimitBtn is pressed, the event is triggered and the code under if statement is executed
        if(e.getSource() == setCreditLimitBtn){
            try{
                //Initializing values of getText() into its respective variables
                boolean test = false;
                int cardID = Integer.parseInt(creditIDText.getText());
                int creditLimit = Integer.parseInt(creditLimitText.getText());
                int GracePeriod = Integer.parseInt(gracePeriodText.getText());
                //Checking what type the obj is 
                for (BankCard obj: list){
                    if (!(obj instanceof CreditCard)) {
                        continue;
                    }
                    //Checking if the cardID matches
                    if (((CreditCard)obj).getcard_id() == cardID){
                        test = true;
                        ((CreditCard)obj).setCreditLimit(creditLimit, GracePeriod);
                        JOptionPane.showMessageDialog(null, "Credit Limit set successfully.");
                    }
                }
                //Checking if credit card is added 
                if(list.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Invalid.Make sure you have added your Credit Card!");
                }
                if (! test) {
                    JOptionPane.showMessageDialog(null, "Card ID not found.");
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid.Make sure you have filled every Text Field.");
            }
        }

        //When the cancelCreditBtn is pressed, the event is triggered and the code under if statement is executed
        if(e.getSource() == cancelCreditBtn){
            try{
                //Initializing values of getText() into its respective variables
                boolean test = false;
                int cardID = Integer.parseInt(cancelCreditText.getText());
                for(BankCard obj: list){
                    if (!(obj instanceof CreditCard)) {
                        continue;
                    }
                    if (obj.getcard_id() == cardID){
                        test = true;
                        ((CreditCard)obj).cancelCreditCard();
                        JOptionPane.showMessageDialog(null, "Credit Cancelled");
                    }
                }
                if (! test) {
                    JOptionPane.showMessageDialog(null, "Card ID not found.");
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Please enter the Card ID.");
            }
        }
    }

    //Creating main method
    public static void main(String[] args){
        //Create a new instance of BankGUI and assign it to obj
        BankGUI obj = new BankGUI();
    }
}

