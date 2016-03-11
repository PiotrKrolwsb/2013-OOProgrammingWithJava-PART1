import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int liczba=Integer.parseInt(reader.nextLine());
        int i=1;
        int suma=1;
        while(i<=liczba)
        {
            suma*=i;
            i++;
        }
        System.out.println("Factorial is "+suma);
    }
}
