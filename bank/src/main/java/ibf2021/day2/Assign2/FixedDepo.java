package ibf2021.day2.Assign2;



public class FixedDepo extends BankAccount{

    private float interest = 3.0f;
    private int fDurationInMnths = 6;
    private Boolean isInterestChanged = false;
    private Boolean isDurationChanged = false;
    

   public FixedDepo(String name,float balance){
       super(name,balance);

   }
   public FixedDepo(String name, float balance, Float interest){
       super(name, balance); //TODO
       this.interest = interest;
   }

   public FixedDepo(String name, float balance, Float interest, Integer fDurationInMnths){
       super(name,balance); //TODO
        this.interest =interest;
        this.fDurationInMnths= fDurationInMnths;
   }


    @Override
    public void deposit(float amount){System.out.println("no action taken");}
            
    @Override
    public void withdraw(float amount){System.out.println("no action taken");}

    @Override 
    public float accountBalance() {
        accountBalance = accountBalance*(1+interest/100);
        return accountBalance;
    }

    public float getInterest(){return interest;}

    public void setInterest(float interest){
        if(interest<3 || interest>6){System.out.println("rate between 3% and 6% only");throw new IllegalArgumentException("invalid interest rate");} else
            {
            int temp=0; temp=temp+1;
            if(isInterestChanged = true){throw new IllegalArgumentException("Cannot change interest rate more than once");} else{this.interest = interest; isInterestChanged=true;}            
            }
        
    }
    public int getFduration(){return fDurationInMnths;}

    public void setFduration(int fDurationInMnths){
        if(interest<3 || interest>6){System.out.println("rate between 3% and 6% only");} else
        {
            if(isDurationChanged = true){throw new IllegalArgumentException("Cannot change interest rate more than once");} else{this.fDurationInMnths = fDurationInMnths;} 
        }
        
    }



}

