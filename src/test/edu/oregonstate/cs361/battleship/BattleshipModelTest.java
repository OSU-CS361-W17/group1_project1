package edu.oregonstate.cs361.battleship;

import com.google.gson.Gson;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import spark.Spark;
import spark.utils.IOUtils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static spark.Spark.awaitInitialization;

/**
 * Created by danielkato on 2/3/17.
 */
class BattleshipModelTest {

    @Test
    void initUserShips() {
        // Create new battleshipModel
        BattleshipModel bsModel = new BattleshipModel();

        // Check values
        assertEquals(bsModel.aircraftCarrier.name, "AircraftCarrier");
        assertEquals(bsModel.aircraftCarrier.length, 5);
        assertEquals(bsModel.battleship.name, "Battleship");
        assertEquals(bsModel.battleship.length, 4);
        assertEquals(bsModel.cruiser.name, "Cruiser");
        assertEquals(bsModel.cruiser.length, 3);
        assertEquals(bsModel.destroyer.name, "Destroyer");
        assertEquals(bsModel.destroyer.length, 2);
        assertEquals(bsModel.submarine.name, "Submarine");
        assertEquals(bsModel.submarine.length, 2);
    }

    @Test
    void initComputerShips() {
        // Create new battleshipModel
        BattleshipModel bsModel = new BattleshipModel();

        // Check values
        assertEquals(bsModel.computer_aircraftCarrier.name, "AircraftCarrier");
        assertEquals(bsModel.computer_aircraftCarrier.length, 5);
        assertEquals(bsModel.computer_battleship.name, "Battleship");
        assertEquals(bsModel.computer_battleship.length, 4);
        assertEquals(bsModel.computer_cruiser.name, "Cruiser");
        assertEquals(bsModel.computer_cruiser.length, 3);
        assertEquals(bsModel.computer_destroyer.name, "Destroyer");
        assertEquals(bsModel.computer_destroyer.length, 2);
        assertEquals(bsModel.computer_submarine.name, "Submarine");
        assertEquals(bsModel.computer_submarine.length, 2);
    }

    @Test
    void initLists() {
        // Create new battleshipModel
        BattleshipModel bsModel = new BattleshipModel();

        assertNotEquals(bsModel.playerHits, null);
        assertNotEquals(bsModel.playerMisses, null);
        assertNotEquals(bsModel.computerHits, null);
        assertNotEquals(bsModel.computerMisses, null);
    }
}
