/**
 * Write a description of class Map here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Map
{
    private Room square = new Room("in the square with a pub in each direction, which do you visit first?");
    private Room revolutions = new Room("in rev's, the floors sticky"),
            antelope = new Room("the bouncer doesn't even ask for ID!"),
            queensHead = new Room("queensHead"),
            butlers = new Room("they serve pizza in here"),
            greyhound = new Room("greyhound"),
            trafalgar = new Room("trafalgar"),
            threeCrown = new Room("threeCrown"),
            queenvic = new Room("queenvic"),
            lordNelson = new Room("lordNelson"),
            harbourmaster = new Room("harbourmaster"),
            horseAndJockey = new Room("horseAndJockey"),
            vineyard = new Room("vineyard"),
            priory = new Room(" priory"),
            crown = new Room("crown"),
            home = new Room("home");
    private Room startRoom;

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
    }


    // initialise room exits
    private void connectSquare()
    {
        square.setExit("north", butlers);
        square.setExit("east", revolutions);
        square.setExit("south", antelope);
        square.setExit("west", queensHead);
        revolutions.setItem(Beers.NEWCASTLE);
    }

//These 3 rooms only go back to the square//

    private void connectQueenshead()
    {
        queensHead.setExit("east", square);
    }

    private void connectRevolutions()
    {
        revolutions.setExit("west", square);

    }

    private void connectButlers()
    {
        butlers.setExit("south", square);
    }

    //The antelope goes north back to the square or south to greyhound//
    private void connectAntelope()
    {
        antelope.setExit("north", square);
        antelope.setExit("south", greyhound);
        antelope.setExit("east", trafalgar);
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








