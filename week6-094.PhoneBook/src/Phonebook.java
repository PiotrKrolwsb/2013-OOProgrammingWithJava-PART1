import java.util.ArrayList;
public class Phonebook
{
    private ArrayList<Person> person = new ArrayList<Person>();

    public void add(String name, String number)
    {
        Person p = new Person(name, number);
        person.add(p);
    }
    public void printAll()
    {
        for(Person p : person)
        {
            System.out.println(p);
        }
    }
    public String searchNumber( String name)
    {
        for(Person p : person)
        {
            if (name.equals(p.getName()))
            {
                return p.getNumber();
            }
        }
        return "number not known";
    }
}
