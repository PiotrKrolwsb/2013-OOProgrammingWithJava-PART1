
import java.util.ArrayList;
/**
 * @author PiotrKrol
 */
public class Library 
{
    private ArrayList<Book> library;
    public Library() 
    {
      this.library = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook)
    {
       library.add(newBook);
    }
    public void printBooks()
    {
        for (Book b : library)
        {
            System.out.println(b);
        }
    }
    public ArrayList<Book> searchByTitle(String title)
    {
        ArrayList<Book> found = new ArrayList<Book>();
        for ( Book t : this.library)
        {
            if (t.title().contains(title))
            {
                found.add(t);
            }
        }
            return found;
    }
    public ArrayList<Book> searchByPublisher(String publisher)
    {
        ArrayList<Book> found = new ArrayList<Book>();
        for ( Book p : this.library)
        {
            if (p.publisher().contains(publisher))
            {
                found.add(p);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByYear(int year)
    {
        ArrayList<Book> found = new ArrayList<Book>();
        for ( Book p : this.library)
        {
            if (p.year() == year)
            {
                found.add(p);
            }
        }
        return found;
    }
}
