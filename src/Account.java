public class Account {
    private int accountNo;
    private String accountHolder;
    private double balance;

    public Account(int accountNo,String accountHolder,double balance){
            this.accountNo = accountNo;
            this.accountHolder = accountHolder;
            this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposite(double ammount){
        balance = balance + ammount;
        return balance;
    }
    public boolean withdraw(double amount){
        if (balance > 0) {
            balance = balance - amount;
        }else {
            System.out.println("Please Check Your Balance");
        }
            return true;

    }

    public void getAccInfo(){
        System.out.println( "Account Holder: "  + accountHolder + "  " + "Account No: " + accountNo + "  " +  "Balance: " + balance + "  ");
    }

}
