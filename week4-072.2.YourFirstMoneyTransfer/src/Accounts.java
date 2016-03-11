
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account konto = new Account("Matt's account",1000);
        Account konto2 = new Account("My account",0);
        konto.withdrawal(100);
        konto2.deposit(100);
        System.out.println(konto.toString());
        System.out.println(konto2.toString());
    }

}
