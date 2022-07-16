import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APITesting {

    @Test
    public void ItShouldReturn200() {
        given().queryParam("q","funny+dog")
                .queryParam("api_key","263nPXmmpGtXBp5W7rnPsUJkT9UWjKTI")
                .when().get("http://api.giphy.com/v1/gifs/search").then().assertThat().statusCode(200);
    }
    @Test
    public void ItShouldRunFasterThan1000L() {
        given().queryParam("q","funny+dog")
                .queryParam("api_key","263nPXmmpGtXBp5W7rnPsUJkT9UWjKTI")
                .when().get("http://api.giphy.com/v1/gifs/search").then().time(lessThan(1000L));
    }
    @Test
    public void ItShouldExistEspecificGif() {
        given().queryParam("q","funny+dog")
                .queryParam("api_key","263nPXmmpGtXBp5W7rnPsUJkT9UWjKTI")
                .when().get("http://api.giphy.com/v1/gifs/search").then()
                .assertThat()
                .body(containsString("S2S0ZDytY6yDm"));
    }
    @Test
    public void ItShouldComeWithThreeElements() {
        given().queryParam("q","funny+dog")
                .queryParam("api_key","263nPXmmpGtXBp5W7rnPsUJkT9UWjKTI")
                .when().get("http://api.giphy.com/v1/gifs/search").then()
                .assertThat()
                .body("size()", is(3));
    }
}