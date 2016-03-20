
import java.util.ArrayList;

/**
 * @author PiotrKrol
 */
public class Team 
{
    private String name;
    private ArrayList<Player> player;
    private int maxSize;
    public Team(String name)
    {
        this.name = name;
        this.maxSize = 16;
        this.player = new ArrayList<Player>();
    }
    public String getName()
    {
        return this.name;
    }
    public void addPlayer(Player otherPlayer)
    {
        if ( player.size() < this.maxSize )
            player.add(otherPlayer);
    }
    public void printPlayers()
    {
        for(Player p : player)
            System.out.println(p.getName() + ", goals " + p.goals());
    }
    public void setMaxSize(int maxSize)
    {
        this.maxSize = maxSize;
    }
    public int size()
    {
        return player.size();
    }
}
