package StepDefinations;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import PageObjects.Loginpage;
import PageObjects.Offerpage;
import PageObjects.PageObjectManager;
import Utils.TEstContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class OfferpageStepDefination {
	public WebDriver driver;
	public String offerpageitem;
	PageObjectManager pageobjectmanager;
	//String landingpageproductname;
	TEstContextSetup textcontextsetup;
	public OfferpageStepDefination(TEstContextSetup textcontextsetup) {
		this.textcontextsetup=textcontextsetup;
	}
	
	@Then("user searched for {string} shortname in offers page to check if product exist")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String string) throws InterruptedException {
		Loginpage loginpage=textcontextsetup.pageobjectmanager.getLandingpage();
		Offerpage offerpage=textcontextsetup.pageobjectmanager.getofferpage();
		loginpage.Top_Deals_link();
		switchtochild();
		Thread.sleep(2000);
		offerpage.search_tom(string);
		//textcontextsetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(string);
		Thread.sleep(2000);
		offerpageitem=offerpage.gettext_nthchild();
		System.out.println(offerpageitem+" offerpageitem");
	}
	public void switchtochild() {
		textcontextsetup.genericutils.switch_to_child();
		
	}
	@And("validate  landing page productname matches offerpage")
	public void validate_lp_ofp_pn() {
		
		System.out.println(offerpageitem+" is offer page item");
		System.out.println(textcontextsetup.landingpageproductname+" is landingpage product");
		Assert.assertEquals(offerpageitem, textcontextsetup.landingpageproductname);
	}
	
}
