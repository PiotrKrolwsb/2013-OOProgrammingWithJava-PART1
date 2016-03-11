
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year: ");
        int number1 = Integer.parseInt(reader.nextLine());
        if(number1%100==0&&number1%400==0)
            System.out.println("The year is a leap year");
        else if(number1%4==0&&number1%400!=0&&number1%100!=0)
            System.out.println("The year is a leap year");
        else
            System.out.println("The year is not a leap year");

    }
}
