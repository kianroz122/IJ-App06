/**
 * Write a description of class Map here.
 *
 * @author (Kian, Alex, Atish)
 * @version (20/12/20)
 */

public class Map
{
    private final Room square = new Room("in the square with a pub in each direction, which do you visit first?");
    private final Room revolutions = new Room("in rev's, the floors sticky");
    private final Room antelope = new Room("in the Antelope, the bouncer doesn't even ask for ID!");
    private final Room queensHead = new Room("in the queensHead");
    private final Room butlers = new Room("in Butlers");
    private final Room greyhound = new Room("in the greyhound");
    private final Room trafalgar = new Room("in the trafalgar");
    private final Room threeCrown = new Room("in the threeCrown");
    private final Room queenvic = new Room("in the queenvic");
    private final Room lordNelson = new Room("in the lordNelson");
    private final Room harbourmaster = new Room("in the harbourmaster");
    private final Room horseAndJockey = new Room("in the horseAndJockey");
    private final Room vineyard = new Room("in the vineyard");
    private final Room priory = new Room("in the priory");
    private final Room crown = new Room("in the crown");
    private final Room home = new Room("in the home");
    private final Room startRoom;
    
    public Map()
    {
        connectRooms();
        startRoom = square; //Game starts outside
        square.setItem(Beers.NEWCASTLE);

    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void connectRooms()
    {
        //connect each room//
        connectSquare();
        connectRevolutions();
        connectQueenshead();
        connectButlers();
        connectGreyhound();
        connectTrafalgar();
        connectThreecrown();
        connectQueenvic();
        connectLordnelson();
        connectHarbourmaster();
        connectHorseandjockey();
        connectPriory();
        connectCrown();
        connectVineyard();
        connectHome();
        connectAntelope();
    }


    // initialise room exits
    private void connectSquare()
    {
        square.setExit("north", butlers);
        square.setExit("east", revolutions);
        square.setExit("south", antelope);
        square.setExit("west", queensHead);
        square.setItem(Beers.NEWCASTLE);
    }

//These 3 rooms only go back to the square//

    private void connectQueenshead()

    {
        queensHead.setExit("east", square);
    }

    private void connectRevolutions()
    {
        revolutions.setExit("west", square);
        revolutions.setItem(Beers.REDSTRIPE);
    }

    private void connectButlers()
    {
        butlers.setExit("south", square);
        butlers.setItem(Beers.STRONGBOW);
    }

    //The antelope goes north back to the square or south to greyhound//
    private void connectAntelope()
    {
        antelope.setExit("north", square);
        antelope.setExit("south", greyhound);
        antelope.setExit("east", trafalgar);
        antelope.setItem(Beers.VODKA);
    }

    //The greyhound leads north to the antelope, west to the queenvic and south to the lordnelson//
    private void connectGreyhound()
    {
        greyhound.setExit("north", antelope);
        greyhound.setExit("west", queenvic);
        greyhound.setExit("south", lordNelson);
    }

    private void connectTrafalgar()
    {
        trafalgar.setExit("west", antelope);
        trafalgar.setExit("south", threeCrown);
    }

    private void connectThreecrown()
    {
        threeCrown.setExit("north", trafalgar);
    }

    private void connectQueenvic()
    {
        queenvic.setExit("east", greyhound);
    }

    private void connectLordnelson()
    {
        lordNelson.setExit("north", greyhound);
        lordNelson.setExit("east", horseAndJockey);
        lordNelson.setExit("south", vineyard);
        lordNelson.setExit("west", harbourmaster);
    }

    private void connectHarbourmaster()
    {
        harbourmaster.setExit("east", lordNelson);
    }

    private void connectHorseandjockey()
    {
        horseAndJockey.setExit("west", lordNelson);
    }

    private void connectPriory()
    {
        priory.setExit("north", horseAndJockey);
    }

    private void connectCrown()
    {
        crown.setExit("north", priory);
    }

    private void connectVineyard()
    {
        vineyard.setExit("north", lordNelson);
        vineyard.setExit("south", home);
    }

    private void connectHome()
    {
        home.setExit("north", vineyard);
    }

    public Room getStartRoom()
    {
        return startRoom;
    }

}








