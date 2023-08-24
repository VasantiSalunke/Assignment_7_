public class ChekingAccount extends Account {

    private double overDraftLimit;

    public ChekingAccount(int accountNo, String accountHolder, double balance, double overDraftLimit) {
        super(accountNo, accountHolder, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void getAccInfo() {
        super.getAccInfo();


        System.out.println("Account Holder: " + getAccountHolder() + "  " + "Account No: " + getAccountNo() + "  " + "Balance: " + getBalance() + "  ");

    }

    @Override
    public boolean withdraw(double amount) {
        if (getBalance() == 0) {
            double temp = overDraftLimit - amount;
            this.overDraftLimit = temp;
            double temp1 = getBalance() - overDraftLimit;
            System.out.println(" " + temp1);

            if (overDraftLimit == 0){
                System.out.println("Overdraft Amount is over");
            }
        }
        return true;
    }
}
