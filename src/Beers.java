
public enum Beers {
    NONE("none", 0),
    NUTS("nuts", -2),
    KEBAB("kebab", -8),
    CHICKEN("chicken", 6),
    CAMDEN_HELLS("camdenhells", 7),
    HOPHOUSE("hophouse", 6),
    NEWCASTLE("newcastle", 6),
    REDSTRIPE("redstripe", 5),
    STRONGBOW("strongbow", 4),
    TEQUILA("tequila", 50),
    VODKA("vodka", 35);



    private static int alcoholLevel;
    private String beerString;


    Beers(String beerString, int alcoholLevel) {
        this.beerString = beerString;
    }


    public String toString() {
        return beerString;
    }

    public static int getAlcoholLevel() {
        return alcoholLevel;
    }

}
