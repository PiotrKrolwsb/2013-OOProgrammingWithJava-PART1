import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) 
     {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String imie=reader.nextLine();
         System.out.print("In reverse order: ");
        for(int i=(imie.length()-1);i>=0;i--)
        {
                System.out.print(imie.charAt(i));
        }  
    }
}
