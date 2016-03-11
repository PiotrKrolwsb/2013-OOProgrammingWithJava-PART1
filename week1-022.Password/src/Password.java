
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        
        while(true)
        {
        System.out.println("Type the password: ");
        double number=Double.parseDouble(reader.nextLine());
        if(number>40 || number<-30)
        {
            
        }
        else
                System.out.println("Wrong!");
        }
      
     

        // Write your code here
    }
}
