
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        String name = "a";
        ArrayList<Student> list = new ArrayList<Student>();
        while(!name.equals(""))
        {
            System.out.print("name: ");
            
            name = reader.nextLine();
            if ( name.equals("")) break; // lub name.isEmpty() 
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            Student student = new Student(name,studentNumber); 
            list.add(student); //lub  list.add(new Student(name,number)) |zamiast 2 linijek kodu
        }
        
        for (Student s : list)
            System.out.println(s.toString());
        //Wyszukiwarka
        int j = 0;
        System.out.println();
        while(j < list.size()) // while, break j,  nie potrzebne
        {
            System.out.print("Give search term: ");
            String search = reader.nextLine();
            System.out.println("Result:");
            for (Student s2 : list)
            {
                if (s2.getName().contains(search))
                {                   
                    System.out.println(s2);
                }
            }
            j++;
            break;
        }
        //Prostsza wersja wyszukiwarki
        /*
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");
 
        for (Student student : list) 
        {
            if (student.getName().contains(searchTerm)) 
            {
                System.out.println(student);
            }
        }
        */
    }
}