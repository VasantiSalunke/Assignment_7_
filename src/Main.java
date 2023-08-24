public class Main {
    public static void main(String[] args) {

        Account [] a1 = new Account[3];
        a1[0] = new SavingsAccount(123898,"ABC",500.56,3);
        a1[1] = new SavingsAccount(234532,"XYZ",4567.78,5);
        a1[2] = new ChekingAccount(587654,"PQR",5634.89,500.70);

        Util.processAccount(a1);
        a1[0].getAccInfo();
        a1[1].getAccInfo();
        a1[2].getAccInfo();
    }
}