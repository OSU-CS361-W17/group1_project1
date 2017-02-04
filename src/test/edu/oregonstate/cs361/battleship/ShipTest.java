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
class ShipTest {

    @Test
    void testConstructor(){
        Ship ship = new Ship();
        assertEquals(ship.name, "");
        assertEquals(ship.length, 0);
    }

    @Test
    void testOtherConstructor(){
        Ship ship = new Ship("testName", 3);
        assertEquals(ship.name, "testName");
        assertEquals(ship.length, 3);
    }
}
