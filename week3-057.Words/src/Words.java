import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while(true)
        {
            System.out.print("Type a word: ");
            String slowo=reader.nextLine();
            if(slowo.isEmpty())
                break;
            words.add(slowo);
        }
        System.out.println("You typed the following words: ");
        for(String slowa : words)
            System.out.println(slowa);
    }
}
