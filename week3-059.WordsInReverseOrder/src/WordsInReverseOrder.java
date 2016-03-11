import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> slowa = new ArrayList<String>();
         while(true)
        {
            System.out.print("Type a word: ");
            String slowo=reader.nextLine();
            if(slowo.isEmpty())
                break;
            slowa.add(slowo);
        }
        
        Collections.reverse(slowa);
        for(String slowo : slowa)
            System.out.println(slowo);
        
    }
    
}
