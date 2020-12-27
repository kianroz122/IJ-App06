/**
 * Write a description of class Map here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Map
{
    private Room square = new Room("A pub in each direction, which do you visit first?");
    private Room revolutions = new Room("in rev's, the floors sticky"),
            antelope = new Room("the bouncer doesn't even ask for ID!"),
            queensHead = new Room("//"),
            butlers = new Room("they serve pizza in here"),
            greyhound = new Room("//"),
            trafalgar = new Room("//"),
            threeCrown = new Room("//"),
            queenvic = new Room("//"),
            lordNelson = new Room("//"),
            harbourmaster,
            horseAndJockey,
            vineyard,
            priory,
            crown,
            home;
    private Room startRoom;

    public Map()
    {
        createRooms();
        startRoom = square; //Game starts outside
        butlers.setItem(Items.PIZZA);
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
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








