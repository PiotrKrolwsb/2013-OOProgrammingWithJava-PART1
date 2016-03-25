public class Money
{
    private final int euros;
    private final int cents;

    public Money(int euros, int cents)
    {
        if (cents > 99)
        {
            euros += cents / 100;
            cents %= 100;
        }
        this.euros = euros;
        this.cents = cents;
    }
    public int euros()
    {
        return euros;
    }
    public int cents()
    {
        return cents;
    }
    @Override
    public String toString() {
        String zero = "";
        if (cents < 10)
        {
            zero = "0";
        }
        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money added)
    {
        int b = this.euros + added.euros;
        int a = this.cents + added.cents;

        return new Money(b,a);
    }
    public boolean less(Money compared)
    {
        if ((this.euros > compared.euros) ||
            (this.euros == compared.euros && this.cents > compared.cents))
        {
            return false;
        }
        return true;
    }
    public Money minus(Money decremented)
    {
        int a = this.cents - decremented.cents;
        int b = this.euros - decremented.euros;
        if (b <0)
        {
            return new Money(0,0);
        }
        if (this.cents == 0 || decremented.cents == 0)
        {
            return new Money(b-1,100 - Math.abs(a)) ;
        }
        return new Money(b,Math.abs(a));
    }
}
