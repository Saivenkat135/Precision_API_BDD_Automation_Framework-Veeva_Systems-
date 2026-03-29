package Client;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class PetClient {

    public Response createPet(String body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
                .post("/pet");
    }

    public Response getPet(int id) {
        return given()
                .get("/pet/" + id);
    }

    public Response updatePet(String body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
                .put("/pet");
    }

    public Response deletePet(int id) {
        return given()
                .delete("/pet/" + id);
    }


}
