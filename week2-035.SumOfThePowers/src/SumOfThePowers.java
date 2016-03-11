
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int wynik=0;
        int i=0;
        int sumaPoteg=0;
        while(i<=number)
        {
            wynik=(int)Math.pow(2, i);
            sumaPoteg+=wynik;
            i++;            
        }
        System.out.println("The result is "+sumaPoteg);

    }
}
