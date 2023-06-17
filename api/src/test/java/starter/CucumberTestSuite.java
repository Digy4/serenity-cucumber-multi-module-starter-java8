package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "com.digy4.java.serenity.cucumber.Digy4SerenityCucumberSupport"},
        glue = {"com.digy4.java.serenity.cucumber", "starter"},
        features = "src/test/resources/features"
)
public class CucumberTestSuite {}
