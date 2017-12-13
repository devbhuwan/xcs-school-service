package xcs.school.features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "xcs.school.glue"
)
public class SchoolServiceFeaturesTest extends AbstractFeaturesTest {

}