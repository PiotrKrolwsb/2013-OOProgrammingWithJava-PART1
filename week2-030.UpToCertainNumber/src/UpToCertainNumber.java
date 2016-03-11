
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write your code here
        int i=1;
        System.out.println("Up to what number? ");
        int liczba=Integer.parseInt(reader.nextLine());
        while(i<=liczba)
        {
            System.out.println(i);
            i++;
        }
        
    }
}
