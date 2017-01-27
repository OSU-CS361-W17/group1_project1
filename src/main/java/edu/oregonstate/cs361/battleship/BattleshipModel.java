/*
** Filename: BattleshipModel.java
** Project: Battleship
** By: Daniel Kato
*/
package edu.oregonstate.cs361.battleship;

/* BattleshipModel class */
public class BattleshipModel {
    public Ship aircraftCarrier;
    public Ship battleship;
    public Ship cruiser;
    public Ship destroyer;
    public Ship submarine;
    public Ship computer_aircraftCarrier;
    public Ship computer_battleship;
    public Ship computer_cruiser;
    public Ship computer_destroyer;
    public Ship computer_submarine;
    public Coord[] playerHits;
    public Coord[] playerMisses;
    public Coord[] computerHits;
    public Coord[] computerMisses;


    /*
    ** Function Name: BattleshipModel (constructor)
    ** Parameters: None
    ** Description: Initializes BattleshipModel
    ** Return: None
    */
    public BattleshipModel(){
        InitUserShips();
        InitComputerShips();
        InitLists();
    }

    /*
    ** Function Name: InitUserShips
    ** Parameters: None
    ** Description: Initializes aircraftCarrier, battleship, cruiser, destroyer, and submarine;
    ** Return: None
    */
    private void InitUserShips(){
        aircraftCarrier = new Ship("AircraftCarrier", 5);
        battleship = new Ship("Battleship", 4);
        cruiser = new Ship("Cruiser", 3);
        destroyer = new Ship("Destroyer", 2);
        submarine = new Ship("Submarine", 2);
        playerHits = new Coord[16];
        playerMisses = new Coord[84];
    }

    /*
    ** Function Name: InitComputerShips
    ** Parameters: None
    ** Description: Initializes computer_aircraftCarrier, computer_battleship, computer_cruiser, computer_destroyer, and computer_submarine;
    ** Return: None
    */
    private void InitComputerShips(){
        computer_aircraftCarrier = new Ship("AircraftCarrier", 5);
        computer_aircraftCarrier.start.setCoords(2, 2);
        computer_aircraftCarrier.end.setCoords(2, 7);
        computer_battleship = new Ship("Battleship", 4);
        computer_battleship.start.setCoords(2, 8);
        computer_battleship.end.setCoords(6, 8);
        computer_cruiser = new Ship("Cruiser", 3);
        computer_cruiser.start.setCoords(4, 1);
        computer_cruiser.end.setCoords(4, 4);
        computer_destroyer = new Ship("Destroyer", 2);
        computer_destroyer.start.setCoords(7, 3);
        computer_destroyer.end.setCoords(7, 5);
        computer_submarine = new Ship("Submarine", 2);
        computer_submarine.start.setCoords(9, 6);
        computer_submarine.end.setCoords(9, 8);
    }

    /*
    ** Function Name: InitLists
    ** Parameters: None
    ** Description: The game board is 10x10, and the sum of all the ship's lengths are 16, therefore a user can have a maximum of 16 hits, and 84 misses
    ** Return: None
    */
    private void InitLists(){
        playerHits = new Coord[16];
        playerMisses = new Coord[84];
        computerHits = new Coord[16];
        computerMisses = new Coord[84];
    }
}