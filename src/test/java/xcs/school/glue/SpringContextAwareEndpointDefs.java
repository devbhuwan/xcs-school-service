package xcs.school.glue;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import xcs.school.AbstractCassandraEmbeddedITTest;
import xcs.school.XcsSchoolServiceApplication;

import static xcs.school.AbstractCassandraEmbeddedITTest.CUCUMBER_PROFILE;

@SpringBootTest(
        classes = XcsSchoolServiceApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
@ActiveProfiles(CUCUMBER_PROFILE)
@ContextConfiguration
abstract class SpringContextAwareEndpointDefs {

    @LocalServerPort
    protected int serverPort;
    private Response response;

    protected RequestSpecification http() {
        return RestAssured.given()
                .port(serverPort)
                .contentType(ContentType.JSON);
    }

    public void apply(Response response) {
        this.response = response;
    }

    public Response response() {
        return this.response;
    }


}
