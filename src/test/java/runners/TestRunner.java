// this package contains runner class
package runners;
//  import necessary classes
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

// Cucumber options for running the test
@CucumberOptions(features = "src/test/resources/features",
        glue = "steps",publish = true,
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

    //data provider for parallel execution

    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
