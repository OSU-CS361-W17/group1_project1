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
 * Created by wongnich on 2/3/17.
 */
class JsonToBattleshipModelTest {

    @Test
    void jsonToBattleship() {

      //receieve JSON request
      staticFiles.location("/public");
      get("/model", (req, res) -> newModel());
      post("/fire/:row/:col", (req, res) -> fireAt(req));
      post("/placeShip/:id/:row/:col/:orientation", (req, res) -> placeShip(req));

      //convert JSON object to Java object
      Gson gson = new Gson();
      BattleshipModel deserializedModel = gson.fromJson(req.body(), BattleshipModel.class);

      //test values of converted model
      assertEquals(deserializedModel.aircraftCarrier.name, "AircraftCarrier");
      assertEquals(deserializedModel.aircraftCarrier.length, 5);
      assertEquals(deserializedModel.battleship.name, "Battleship");
      assertEquals(deserializedModel.battleship.length, 4);
      assertEquals(deserializedModel.cruiser.name, "Cruiser");
      assertEquals(deserializedModel.cruiser.length, 3);
      assertEquals(deserializedModel.destroyer.name, "Destroyer");
      assertEquals(deserializedModel.destroyer.length, 2);
      assertEquals(deserializedModel.submarine.name, "Submarine");
      assertEquals(deserializedModel.submarine.length, 2);
    }
}
