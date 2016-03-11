
import java.util.Scanner;

public class SeparatingCharacters 
{
    public static void main(String[] args) 
     {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String imie=reader.nextLine();
        
        //System.out.println("Last character: "+separateCharacter(imie));
        for(int i=0;i<imie.length();i++)
        {
                System.out.println((i+1)+". character: "+imie.charAt(i));
        }  
    }
}
