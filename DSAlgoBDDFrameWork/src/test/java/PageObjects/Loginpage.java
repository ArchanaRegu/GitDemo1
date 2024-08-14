package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	By search=By.xpath("//input[@type='search']");
	By product_name=By.xpath("//h4[text()='Tomato - 1 Kg']");
	By deals_link=By.linkText("Top Deals");
	
	
	WebDriver driver;
	
public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	public void search_tom(String short_name) {
		driver.findElement(search).sendKeys(short_name,Keys.ENTER);
		
	}
	public String product_name() {
		String LPSD_string= driver.findElement(product_name).getText().split("-")[0].trim();
		System.out.println(LPSD_string+" in Loginpage");
		return LPSD_string;
	}
	
	public void Top_Deals_link() {
		driver.findElement(deals_link).click();
	}
	public String getTitle() {
		return driver.getTitle();
	}
	
		}
	
	
