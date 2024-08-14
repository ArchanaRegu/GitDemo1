package cucumberoptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/java/Feature"},glue={"StepDefinations"},
monochrome=true,tags="@Offerspage or @Landingpage",plugin= {"html:target/cucumber.html","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestNgRunner extends AbstractTestNGCucumberTests {
@Override	
@DataProvider(parallel=true)
public Object[][] scenarios()
{
	return super.scenarios();
}
}