package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue ="stepDefinitions"
        ,tags="@ikisi or @nutella"
        ,dryRun = false
)
public class Runner {

    //Bir framework'de bir  tek Runner class'i yeterli olabilir
    // Runner class'inda calss body'sinde hic bir sey olmaz
    //Runner class'imizi oneli yapan 2 adeta annotaion vardir.

}
