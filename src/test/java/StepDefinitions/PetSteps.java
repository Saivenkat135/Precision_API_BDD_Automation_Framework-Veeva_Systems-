package StepDefinitions;

import base.BaseTest;
import Client.PetClient;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.junit.Assert;

public class PetSteps extends BaseTest {

    PetClient client = new PetClient();
    Response response;
    int petId;

    @Given("I create a new pet")
    public void createPet() {
        setup();

        petId = (int) (Math.random() * 100000);

        String body = "{ " +
                "\"id\": " + petId + "," +
                "\"name\": \"doggie\"," +
                "\"status\": \"available\"" +
                "}";

        response = client.createPet(body);

        System.out.println("Create Response: " + response.asString());
    }


    @When("I get the pet details")
    public void getPet() {
        response = client.getPet(petId);

        System.out.println("GET Response: " + response.asString());
    }


    @Then("pet details should match")
    public void validatePet() {
        Assert.assertEquals("Pet not found!", 200, response.getStatusCode());
    }


    @When("I update the pet status")
    public void updatePet() {
        String body = "{ \"id\": " + petId + ", \"name\": \"doggie\", \"status\": \"sold\" }";
        response = client.updatePet(body);
    }

    @Then("pet should be updated")
    public void validateUpdate() {
        Assert.assertEquals("sold", response.jsonPath().getString("status"));
    }

    @When("I delete the pet")
    public void deletePet() {
        response = client.deletePet(petId);
    }

    @Then("pet should be deleted")
    public void validateDelete() {
        Assert.assertEquals(200, response.getStatusCode());
    }



}
