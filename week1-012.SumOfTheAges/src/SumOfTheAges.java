
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a name: ");
        String name1=reader.nextLine();
        System.out.println("Type your age: ");
        int number1=Integer.parseInt(reader.nextLine());
        System.out.println("Type a name: ");
        String name2=reader.nextLine();
        System.out.println("Type your age: ");
        int number2=Integer.parseInt(reader.nextLine());
        int wynik=number1+number2;
        System.out.println(name1+" and "+name2+" are "+wynik+" years old in total.");

        // Implement your program here
    }
}
