import java.util.ArrayList;

/**
 * Constructor, sets sober rating @ 100 and creates array list of beers and food
 */
public class Player
{
    private int soberRating = 100;
    private boolean take;
    private String name;
    private ArrayList<Beers> itemList = new ArrayList();


    public Player(String name)
    {
        this.name=name;
    }

    /**
     * Returns sober rating
     * @param soberRating
     */
    public void setSoberRating(int soberRating)
    {
        this.soberRating = soberRating;
    }

    public int getSoberRating()
    {
        return soberRating;
    }

    public void setTake(boolean take)
    {
        this.take = take;
    }

    public boolean getTake()
    {
        return take;
    }

    /**
     * Adds item to inventory
     * @param item
     */
    public void pickup(Beers item)
    {
        itemList.add(item);
    }

    public void drop (Beers dropItem)
    {
        for(Beers item: itemList)
        {
            if(item == dropItem)
                itemList.remove(dropItem);
        }
    }
}
