package ibf2021.day2.Assign2;
import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

public class BankAccount 
{
    private String name;
    private String accountNumber;
    protected float accountBalance;
    private String transactions;
    private boolean isClosed;
    private String accountCreateDate;
    private String accountClosedDate;
    public ArrayList<String> transactionHist;
    private float depoAmt;
    private float wthdAmt;
    
    
    public BankAccount(String name, float accountBalance){
        int min = 100000000;  int max = 999999999;
        this.name=name;
        //to do with account balance
        this.accountBalance = accountBalance;   //f converts to float
        this.accountNumber = String.valueOf((int)Math.floor(Math.random()*(max-min+1)+min));
        this.transactionHist = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float accountBalance() {
        return accountBalance;
    }

    public void accountBalance(float accountBalance) {
        this.accountBalance = accountBalance; 
    }

    public String accountNumber() {
        return accountNumber;
    }

    public void accountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public List<String> getTransactions() {
        for(int i = 0; i < transactionHist.size(); i++) {   
            System.out.print(transactionHist.get(i));
        }  
        return transactionHist;
    }

    
    public void setTransactions(String transactions) {
      //  this.transactions = transactions;
       
        transactionHist.add(transactions);

    }

    public boolean isIsClosed() {
        return isClosed;
    }

    public void setIsClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public String getAccountCreateDate() {
        return accountCreateDate;
    }

    public void setAccountCreateDate(String accountCreateDate) {
        this.accountCreateDate = accountCreateDate;
    }

    public String getAccountClosedDate() {
        return accountClosedDate;
    }

    public void setAccountClosedDate(String accountClosedDate) {
        this.accountClosedDate = accountClosedDate;
    }

    public void deposit(float depoAmt) { 
        accountBalance = accountBalance + depoAmt;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        String dtfnow =dtf.format(now);
        setTransactions(String.valueOf("Deposited " + depoAmt + " @ " + dtfnow));                      //Store transaction history
        this.depoAmt=depoAmt;
        
    }

    public void withdraw(float wthdAmt) { 
        if( wthdAmt > accountBalance){throw new IllegalArgumentException("Insufficient Balance");} else 
        {
        accountBalance = accountBalance - wthdAmt;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        String dtfnow =dtf.format(now);
        
        setTransactions(String.valueOf("Withdrawn " + wthdAmt + " @ " + dtfnow));                      //Store transaction history
        this.wthdAmt=wthdAmt;
        }
    }

}
