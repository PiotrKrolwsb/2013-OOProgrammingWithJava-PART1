
public class NumberStatistics 
{
    private int amountOfNumber;
    private int sum;
    
    public NumberStatistics() 
    {
        amountOfNumber = 0;
    }
    public void addNumber(int number) 
    {
        amountOfNumber++;
        sum+=number; 
    }
    public int amountOfNumbers() 
    {
       return amountOfNumber;
    }
    public int sum()
    {
        return sum;
    }
    public double average()
    {
        if (amountOfNumber == 0)
            return (double)sum/(amountOfNumber +1);
        return (double) sum/amountOfNumber;
    }
}
