package com.suntaragali.crm.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/java/com/suntaragali/crm/features/dealsMap.feature"},
		glue = {"com.suntaragali.crm.step_def"},
		plugin= { "pretty", "html:target/test-output"},
		monochrome=true,
		dryRun=false,
		strict = true
		)
		
public class TestRunner {


}
