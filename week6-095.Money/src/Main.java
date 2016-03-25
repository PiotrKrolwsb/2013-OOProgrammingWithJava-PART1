public class Main
{
    public static void main(String[] args)
    {
        Money a = new Money(10,0);
        Money b = new Money(7,40);

        Money c = a.minus(b);

        System.out.println(a);  // 
        System.out.println(b);  // 
        System.out.println(c);  // 

        c = c.minus(a);         
        
        System.out.println(c);
        
    }
}
