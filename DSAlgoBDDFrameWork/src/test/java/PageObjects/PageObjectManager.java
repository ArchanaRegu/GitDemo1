package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public Loginpage loginpage;
	public Offerpage offerpage;
	public Checkoutpage checkoutpage;
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	public Loginpage getLandingpage() {
		loginpage=new Loginpage(driver);
		return loginpage;
		
	}
	public Offerpage getofferpage() {
		offerpage=new Offerpage(driver);
		return offerpage;
	}
	public Checkoutpage getcheckoutpage() {
		checkoutpage=new Checkoutpage(driver);
		return checkoutpage;
		}
	}
