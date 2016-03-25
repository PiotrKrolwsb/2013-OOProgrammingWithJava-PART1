import java.util.Scanner;
public class Main 
{  

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        Birdwatcher birdWatcher = new Birdwatcher();

        String userInput = "";
        while (true) 
        {
            System.out.println("?");
            userInput = reader.nextLine();
            if (userInput.equals("Quit")) 
            {
                break;
            } 
            else if (userInput.equals("Add")) 
            {
                addBird(reader, birdWatcher);
            } 
            else if (userInput.equals("Observation")) 
            {
                System.out.println("What was observed:? ");
                String name = reader.nextLine();
                observeBird(name, birdWatcher);
            } 
            else if (userInput.equals("Statistics")) 
            {
                birdWatcher.statistics();
            } 
            else if (userInput.equals("Show")) 
            {
                System.out.println("What?");
                String name = reader.nextLine();
                showBird(name, birdWatcher);
            }
        }
    }
    
    public static void addBird(Scanner reader, Birdwatcher birdwatcher) 
    {
        System.out.println("Name: ");
        String name = reader.nextLine();
        System.out.println("Latin Name: ");
        String LatinName = reader.nextLine();
        birdwatcher.addBird(name, LatinName);
    }
    
    public static void observeBird(String name, Birdwatcher birdwatcher) 
    {
        for (BirdDatabase B : birdwatcher.birds()) 
        {
            if (name.equals(B.getName())) 
            {
                B.observed();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
    
    public static void showBird(String name, Birdwatcher birdwatcher) 
    {
        for (BirdDatabase B : birdwatcher.birds()) 
        {
            if (name.equals(B.getName())) 
            {
                System.out.println(B);
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
}   
    


