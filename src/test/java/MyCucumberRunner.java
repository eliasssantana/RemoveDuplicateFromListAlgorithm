import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/cucumbertests", // Path to your feature files
        glue = {"./cucumbertests"}         // Package with your step definitions
)
public class MyCucumberRunner {
}
