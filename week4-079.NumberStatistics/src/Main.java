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
        
        while(number != -1)
        {
            number = Integer.parseInt(reader.nextLine());
            stats.addNumber(number);
            if( number % 2 == 0)    evenStats.addNumber(number);
            if( number % 2 != 0)    oddStats.addNumber(number);
        }
        System.out.println("sum: " + (stats.sum()+1));
        while(number != -1)
        {
          
        }
        System.out.println("sum: "+(stats.sum()+1));
        System.out.println("sum of even: "+(evenStats.sum()+1));
        System.out.println("sum of odd: "+(oddStats.sum()+1));
    }
}
