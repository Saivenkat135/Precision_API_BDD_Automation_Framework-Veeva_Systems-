package base;

import io.restassured.RestAssured;
import utils.ConfigReader;

public class BaseTest {

    public void setup() {
        String baseUrl = ConfigReader.get("base.url");

        if (baseUrl == null) {
            throw new RuntimeException("Base URL is NULL. Check config.properties!");
        }

        RestAssured.baseURI = baseUrl;
    }
}
