import java.util.ArrayList;

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
