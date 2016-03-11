/**
 * @author PiotrKrol
 */
public class LyyraCard 
{
    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }

    @Override
    public String toString() 
    {
        return "The card has " + this.balance + " euros";
    }
    public void payEconomical()
    {
      balance -= 2.5;
      if (balance < 0) balance += 2.5;
    }
    public void payGourmet()
    {
      balance -= 4.0;
      if (balance < 0) balance += 4.0;
    }
    public void loadMoney(double amount)
    {
        if(amount < 0) {}
        else balance += amount;
        if(balance >150) balance = 150;
        
    }
}
