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

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by danielkato on 2/3/17.
 */
class CoordTest {
    @Test
    void setCoords() {
        Coord coord = new Coord();
        coord.setCoords(7, 8);
        assertEquals(coord.Across, 7);
        assertEquals(coord.Down, 8);
    }
}
