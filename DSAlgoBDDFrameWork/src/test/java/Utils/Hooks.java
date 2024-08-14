package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.TEstContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	TEstContextSetup testcontextsetup;
	
	public Hooks(TEstContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	@Before
	public void BeforeScenario() throws IOException {
	String title=testcontextsetup.testbase.WebDriverManager().getTitle();
	System.out.println(title+" Title from before hook");
	}
	@After
	public void AfterScenario() throws IOException {
		testcontextsetup.testbase.WebDriverManager().quit();;
	}
	@AfterStep
	public void AddScreenShot(Scenario scenario) throws IOException {
		WebDriver driver=testcontextsetup.testbase.WebDriverManager();
		if(scenario.isFailed()) {
		File sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent=FileUtils.readFileToByteArray(sourcepath);
		scenario.attach(fileContent, "image/png", "image");
		
		}
	}

}
