
public enum Beers
{
    NONE("none",0),
    FOSTERS("fosters",5),
    NEWCASTLE("newcastle",6),
    COMDEN_HILLS("comdenhills",7),
    HOPHOUSE("hophouse",6);

    private String beerString;
    private int alcoholLevel;

    Beers(String beerString,int alcoholLevel)
    {
        this.beerString = beerString;
    }

    public String toString()
    {
        return beerString;
    }

    public int getAlcoholLevel()
    {
        return alcoholLevel;
    }

}
