import java.util.Scanner;

public class FirstCharacters {
     public static void main(String[] args) 
     {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String imie=reader.nextLine();
        
        //System.out.println("Last character: "+separateCharacter(imie));
        for(int i=0;i<3;i++)
        {
            if(imie.length()<3)
                System.out.print("");
            else
                System.out.println((i+1)+". character: "+imie.charAt(i));
        }
        
    
        
    }
    
    // do here the method
    public static char separateCharacter(String text)
    {
        return text.charAt(text.length()-1);
    }
}
