import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();
        int number = 0;
        System.out.println("Type numbers:");
        
        while(true)
        {
            number = Integer.parseInt(reader.nextLine());
            if ( number == -1) break;
            stats.addNumber(number);
            
            if( number % 2 == 1)    oddStats.addNumber(number);
            else                    evenStats.addNumber(number);
        }
        System.out.println("sum: "+stats.sum());
        System.out.println("sum of even: "+evenStats.sum());
        System.out.println("sum of odd: "+oddStats.sum());
        //System.out.println(stats.average());
        //System.out.println(stats.amountOfNumbers());
       
        /*
        Scanner reader = new Scanner(System.in);

        NumberStatistics stats=  new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();
        System.out.println("Type numbers:");
        int number=0;
        while (true) {
            number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            stats.addNumber(number);
            if ((number % 2) == 1) 
            {
                oddStats.addNumber(number);
            } 
            else 
            {
                evenStats.addNumber(number);
            }
        }
        System.out.println("sum: "+stats.sum());
        System.out.println("sum of even: "+evenStats.sum());
        System.out.println("sum of odd: "+oddStats.sum());
                */
    }
}
