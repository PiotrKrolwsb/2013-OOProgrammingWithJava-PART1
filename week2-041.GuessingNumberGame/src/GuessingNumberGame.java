
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        // program your solution here. Do not touch the above lines!
        //System.out.println(numberDrawn);
        int liczba=0;
        int licznik=1;
        while(numberDrawn!=liczba)
        {
            System.out.println("Guess a number: ");
            liczba= Integer.parseInt(reader.nextLine());
            if(liczba>numberDrawn)
            {
                System.out.println("The number is lesser, guesses made: "+licznik);
    
            }
            else if(liczba<numberDrawn)
            {
                System.out.println("The number is greater, guesses made: "+licznik);
               
            }
            else
            {
                System.out.println("Congratulation, your guess is correct!");
       
            }
            licznik++;
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() 
    {
        return new Random().nextInt(101);
    }
}
