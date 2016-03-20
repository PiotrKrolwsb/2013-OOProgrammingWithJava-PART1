
public class CashRegister 
{
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() 
    {
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }
    public double payEconomical(double cashGiven) 
    {
        double economicalMeal = 2.5;
        if (cashGiven >= economicalMeal )
        {
            this.cashInRegister += economicalMeal;
            this.economicalSold++;
            return cashGiven - economicalMeal;
        }
        else
        {
            return cashGiven;
        }
    }
    public double payGourmet(double cashGiven) 
    {
        double gourmetMeal = 4.0;
        if (cashGiven >= gourmetMeal )
        {
            this.cashInRegister += gourmetMeal;
            this.gourmetSold++;
            return cashGiven - gourmetMeal;
        }
        else
        {
            return cashGiven;
        }
    }
    public boolean payEconomical(LyyraCard card)
    {
        double economicalMeal = 2.5;
        if (card.balance() >= economicalMeal)
        {
            this.economicalSold++;
            card.pay(economicalMeal);
        }
        else
        {
            return false;
        }
        return true;
    }
    public boolean payGourmet(LyyraCard card)
    {
        double gourmetMeal = 4.0;
        if (card.balance() >= gourmetMeal)
        {
            this.gourmetSold++;
            card.pay(gourmetMeal);;
        }
        else
        {
            return false;
        }
        return true;
    }
    public void loadMoneyToCard(LyyraCard card, double sum)
    {
        if (sum > 0)
        {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }
    public String toString() 
    {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}