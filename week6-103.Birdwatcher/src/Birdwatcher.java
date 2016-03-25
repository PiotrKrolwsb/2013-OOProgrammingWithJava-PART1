import java.util.ArrayList;

public class Birdwatcher 
{
    private ArrayList<BirdDatabase> Birds;

    public Birdwatcher() 
    {
        this.Birds = new ArrayList<BirdDatabase>();
    }  
    public void addBird (String name, String latinName) 
    {
        this.Birds.add(new BirdDatabase(name, latinName));
    }
    public ArrayList<BirdDatabase> birds() 
    {
        return this.Birds;
    }
    public void statistics() 
    {
        for (BirdDatabase b : Birds) 
        {
            System.out.println(b);
        }
    }
}