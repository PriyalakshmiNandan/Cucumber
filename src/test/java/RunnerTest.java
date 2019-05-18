import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:target/cucumber.html"},features = {"src/test/resources/features"},glue={"com.bbc.webpage.stepdefinitions"},strict=true,monochrome=true)
public class RunnerTest {

}
