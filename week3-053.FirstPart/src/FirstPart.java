
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String slowo=reader.nextLine();
        
        System.out.println("Length of the first part: ");
        int czesc=Integer.parseInt(reader.nextLine());
        System.out.println("Result: "+slowo.substring(0, czesc));
        
    }
}
