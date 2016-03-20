/**
 * @author PiotrKrol
 */
public class BoundedCounter 
{
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) 
    {
        this.upperLimit = upperLimit;
    }
    public int getValue()
    {
        return value;
    }
    public void setValue(int value)
    {
       if(value > upperLimit || value < 0)
       {}
       else
            this.value = value; 
    }
    public void next() 
    {
        if(value < upperLimit) 
        {
            value++;
        }
        else
        {
            value = 0;
        }    
    }
    public String toString() 
    {
       while(value < 10)
       {
           return "0" + value;
       }
       return "" + value;
    }
}
