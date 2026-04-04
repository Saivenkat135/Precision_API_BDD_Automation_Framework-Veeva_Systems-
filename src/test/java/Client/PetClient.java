package Client;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class PetClient {
    // ------------------Test Case 1 -----------------------
    public Response createPet(String body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
                .post("/pet");
    }

    public Response getPet(long id) {
        return given()
                .get("/pet/" + id);
    }

    public Response updatePet(String body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
                .put("/pet");
    }

    public Response deletePet(long id) {
        return given()
                .delete("/pet/" + id);
    }

    //---------------------Test Case -2 -----------------------
    public Response getInventory() {
        return given()
                .get("/store/inventory");
    }

    public Response findPetsByStatus(String status) {
        return given()
                .queryParam("status", status)
                .get("/pet/findByStatus");
    }







}
