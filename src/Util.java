public class Util {
    public static void processAccount(Account[] accounts){
        for (Account account : accounts){
            if (account instanceof SavingsAccount) {
                account.deposite(300.35);
            } else if (account instanceof ChekingAccount) {
                account.withdraw(200);


        }
        }
    }
}
