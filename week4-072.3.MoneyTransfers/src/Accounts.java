
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account konto = new Account("A", 100.0);
        Account konto2 = new Account("B", 0.0);
        Account konto3 = new Account("C", 0.0);
        transfer(konto, konto2, 50.0);
        transfer(konto2,konto3, 25.0);
        System.out.println(konto3);
        
          
    }

    public static void transfer(Account from, Account to, double howMuch)
    {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
