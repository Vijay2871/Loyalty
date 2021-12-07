package testRunner;



import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/java/features/Negative.feature"},
        glue = {"/steps"},tags = "@No_CustomerID",
        publish = true)


public class TestRunner {
}
