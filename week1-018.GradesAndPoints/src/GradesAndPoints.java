
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int number1 = Integer.parseInt(reader.nextLine());
        
        if(number1>=0 && number1<=29)
            System.out.println("Grade: failed");
        else if(number1>=30 && number1<=34)
            System.out.println("Grade: 1");
        if(number1>=35 && number1<=39)
            System.out.println("Grade: 2");
        if(number1>=40 && number1<=44)
            System.out.println("Grade: 3");
        if(number1>=45 && number1<=49)
            System.out.println("Grade: 4");
        if(number1>=50 && number1<=60)
            System.out.println("Grade: 5");

    }
}
