
public enum Beers
{
    NONE("none",0),
    REDSTRIPE("redstripe",5),
    NEWCASTLE("newcastle",6),
    CAMDEN_HELLS("camdenhells",7),
    STRONGBOW("strongbow",4),
    HOPHOUSE("hophouse",6),
    VODKA("vodka",35),
    TEQUILA("tequila",50),
    KEBAB("kebab", -2),
    CHICKEN("chicken", -8),
    NUTS("nuts", -4);


    private static int alcoholLevel;
    private String beerString;


    Beers(String beerString,int alcoholLevel)
    {
        this.beerString = beerString;
    }


    public String toString()
    {
        return beerString;
    }

    public static int getAlcoholLevel()
    {
        return alcoholLevel;
    }

}
