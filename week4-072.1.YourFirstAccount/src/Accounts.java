
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account konto = new Account("Piorek",100.0);
        konto.deposit(20.0);
        System.out.println(konto.toString());
    }

}
