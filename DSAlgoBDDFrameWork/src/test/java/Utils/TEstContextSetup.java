package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TEstContextSetup {
public WebDriver driver;
public String offerpageitem;
public String landingpageproductname;
public PageObjectManager pageobjectmanager;
public TestBase testbase;
public GenericUtils genericutils;
public TEstContextSetup() throws IOException {
	testbase=new TestBase();
	pageobjectmanager=new PageObjectManager(testbase.WebDriverManager());
	genericutils=new GenericUtils(testbase.WebDriverManager());
	
}

}
