package testRunner;



import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/Loyalty.feature"},
        glue = {"/steps"},
        publish = true)


public class TestRunner {
}
