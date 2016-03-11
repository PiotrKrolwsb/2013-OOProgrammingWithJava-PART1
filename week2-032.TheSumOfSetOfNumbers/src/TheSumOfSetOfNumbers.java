
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int liczba=0;
        int suma=0;
        System.out.println("Unitl what? ");
        int liczbaDoWczytania=Integer.parseInt(reader.nextLine());
        
        while(liczba<=liczbaDoWczytania)
        {
            suma+=liczba;
            liczba++;
        }
        System.out.println("Sum is "+suma);
    }
}
