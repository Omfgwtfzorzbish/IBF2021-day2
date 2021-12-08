package ibf2021.day2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ibf2021.day2.Assign2.BankAccount;


public class BankAccountTest 
{
    
    @Test
    public void testGetName(){
        BankAccount account = new BankAccount("John Smith", 123.0f);
        assertTrue(account.getName().equals("John Smith"));
    }

    @Test
    public void testGetBalance(){
        BankAccount account = new BankAccount("John Smith", 123.45f);
        assertTrue(account.accountBalance()==123.45f);
        System.out.println("test get balance succesful");
    }
    @Test
    public void testDeposit(){
        BankAccount account = new BankAccount("John Smith", 1.0f);
        account.deposit(1.0f);
        
        assertTrue(account.accountBalance()==2.0f);
        System.out.println("test deposit succesful");
    }

    @Test
    public void testWithdraw(){
        BankAccount account = new BankAccount("John Smith", 12.34f);
        account.withdraw(2.47f);
        assertTrue(account.accountBalance()==9.87f);
        System.out.println("test deposit succesful");
    }

    @Test
    public void getTransactions(){
        BankAccount account = new BankAccount("John Smith", 12.34f);
        account.deposit(3.0f); account.deposit(3.0f); account.deposit(3.0f);
        assertTrue(account.transactionHist.size() == 3);
    } 

    @Test
    public void getBankAccNumber(){
        BankAccount account = new BankAccount("John Smith", 2.0f);
        assertTrue(account.accountNumber().length() == 9);
    }

    @Test
    public void IsClosed(){
        BankAccount account = new BankAccount("John Smith", 2.0f);
        assertTrue(account.isIsClosed()==false);
    }
}
