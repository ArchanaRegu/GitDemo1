package StepDefinations;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import PageObjects.Checkoutpage;
import PageObjects.Loginpage;
import Utils.TEstContextSetup;

public class LandingpageStepDefination {
	public WebDriver driver;
	public String offerpageitem;
	public String landingpageproductname;
	public TEstContextSetup textcontextsetup;
	public Loginpage loginpage;
	public Checkoutpage checkoutpage;
	public LandingpageStepDefination(TEstContextSetup textcontextsetup) {
		this.textcontextsetup=textcontextsetup;
		this.loginpage=textcontextsetup.pageobjectmanager.getLandingpage();
		
	}
		
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
//		textcontextsetup.driver=new ChromeDriver();
//		textcontextsetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	System.out.println(loginpage.getTitle());
	}

	@When("user searched with shortname {string} and extracted actual name of product")
	public void actual_name_of_product(String string) {
		
		loginpage.search_tom(string);
		textcontextsetup.landingpageproductname=loginpage.product_name();
		//textcontextsetup.landingpageproductname=textcontextsetup.driver.findElement(By.xpath("//h4[text()='Tomato - 1 Kg']")).getText().split("-")[0].trim();
		System.out.println(textcontextsetup.landingpageproductname+" is extracted from homepage");
	}
	@When("Added {int} items of the selected product to the cart")
	public void addeditems_selected_product_to_cart(Integer int1)  {
		checkoutpage=textcontextsetup.pageobjectmanager.getcheckoutpage();
	    checkoutpage.value_count();
	    
	    checkoutpage.Add_cart();
	}

	
}