import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    void shouldPostmanEchoAnswer() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Передача данных")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("Передача даных"))
        ;
    }
}
