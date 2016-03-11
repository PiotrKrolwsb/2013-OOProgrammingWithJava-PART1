
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int liczba=Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int liczba2=Integer.parseInt(reader.nextLine());
        while(liczba<=liczba2)
        {
            System.out.println(liczba);
            liczba++;
        }

    }
}
