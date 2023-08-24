public class SavingsAccount extends Account{

    private int interestRate;

    public  SavingsAccount(int accountNo, String accountHolder, double balance, int interestRate ){
        super(accountNo, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void getAccInfo() {
        System.out.println( "Account Holder: "  + getAccountHolder() + "  " + "Account No: " + getAccountNo() + "  " +  "Balance: " + getBalance() + "  ");
    }
}
