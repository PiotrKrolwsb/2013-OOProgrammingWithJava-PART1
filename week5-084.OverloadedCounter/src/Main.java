public class Main {
    public static void main(String[] args) 
    {
        // write testcode here
        Counter c = new Counter(900,false);
        c.decrease(-55);
 
        System.out.println(c.value());
        
        Counter c2 = new Counter(2,false);
        c2.decrease(5);
        System.out.println(c2.value());
       
    }
}
