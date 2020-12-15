public class Player
{
    private int soberRating;
    private boolean take;
    private String name;

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
}
