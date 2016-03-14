/**
 * @author PiotrKrol
 */
public class Counter 
{
    private int startingValue;
    private boolean check;
    
    public Counter(int startingValue, boolean check)
    {
        this.startingValue = startingValue;
        this.check = check;
    }
    public Counter(int startingValue)
    {
        this(startingValue,false);
    }
    public Counter(boolean check)
    {
      this(0,check);
    }
    public Counter()
    {
        this(0,false);
    }
    //methods
    public int value()
    {
        return this.startingValue;
    }
    public void increase()
    {
        this.startingValue++;
    }
    public void decrease()
    {
        if (check == true && this.startingValue <= 0)
            this.startingValue = 0;
        else
            this.startingValue--;
    }
    public void increase(int increaseAmount)
    {
        if (increaseAmount < 0) {}
        else this.startingValue+=increaseAmount;
    }
    public void decrease(int decreaseAmount)
    {
        if (decreaseAmount < 0) {}
        else if (check == false && this.startingValue > 0) 
                { 
                    this.startingValue -= decreaseAmount;
                }
        else if(check = true && (this.startingValue - decreaseAmount) < 0) 
               { 
                   this.startingValue = 0;
               }
       
        
        
    
    }
}
