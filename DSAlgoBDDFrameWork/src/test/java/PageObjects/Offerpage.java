package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Offerpage {
	WebDriver driver;
	By search=By.xpath("//input[@type='search']");
	By nth_child_tom=By.cssSelector("tr td:nth-child(1)");
public Offerpage(WebDriver driver) {
	this.driver=driver;
}
public void search_tom(String short_name) {
	driver.findElement(search).sendKeys(short_name,Keys.ENTER);
	
}
public String gettext_nthchild() {
	String offerpageitem=driver.findElement(nth_child_tom).getText();
    
	System.out.println(offerpageitem+" offerpageitem in Loginpage");
	return offerpageitem;
}
}