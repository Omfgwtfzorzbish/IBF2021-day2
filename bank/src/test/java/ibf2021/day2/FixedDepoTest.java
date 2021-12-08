package ibf2021.day2;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Executable;

import org.junit.Test;

import ibf2021.day2.Assign2.FixedDepo;

public class FixedDepoTest {
   @Test
   public void accountBalance(){
       FixedDepo account = new FixedDepo("John", 100.0f, 3.0f);
       assertTrue(account.accountBalance()==103.0f);
       System.out.println("Test accBal succesful");
   }

   @Test(expected = IllegalArgumentException.class)
   public void setInterest(){
       FixedDepo account = new FixedDepo("John", 100.0f, 3.0f);
        account.setInterest(2.0f);
       System.out.println("Test set illegal interest succesful");
   }
    
}
