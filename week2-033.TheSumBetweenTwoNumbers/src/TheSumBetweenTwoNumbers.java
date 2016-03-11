
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int liczba=Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int liczba2=Integer.parseInt(reader.nextLine());
        int suma=0;

        while(liczba<=liczba2)
        {
            suma+=liczba;
            liczba++;
        }
        System.out.println("Sum is "+suma);
        
    }
}
