package runner;

import io.cucumber.testng.CucumberOptions;
import steps.baseClass;

@CucumberOptions(features="src/test/java/feature"
,glue="steps"
,monochrome=true
,publish=true
,tags="@sri or @smoke")
public class cucumberGroupRunner extends baseClass{

}
