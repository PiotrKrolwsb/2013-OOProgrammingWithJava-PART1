
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type tyour username: ");
        String string1 = reader.nextLine();
        System.out.println("Type tyour password: ");
        String string2 = reader.nextLine();
        
        if(string1.equals("alex")&&string2.equals("mightyducks")||string1.equals("emily")&&string2.equals("cat"))
            System.out.println("You are now logged into the system!");
        else
            System.out.println("Your username or password was invalid!");

    }
}
