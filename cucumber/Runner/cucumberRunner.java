package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.baseClass;


@CucumberOptions(features="src/test/java/feature"
				,glue="steps"
				,monochrome=true
				,publish=true)
				
public class cucumberRunner extends baseClass{
	
	

}
