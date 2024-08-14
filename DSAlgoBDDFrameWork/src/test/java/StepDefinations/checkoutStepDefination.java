package StepDefinations;

import org.testng.Assert;

import PageObjects.Checkoutpage;
import Utils.TEstContextSetup;
import io.cucumber.java.en.*;

public class checkoutStepDefination {
	public TEstContextSetup textcontextsetup;
	public Checkoutpage checkoutpage;
	public checkoutStepDefination(TEstContextSetup textcontextsetup) {
		this.textcontextsetup=textcontextsetup;
		this.checkoutpage=textcontextsetup.pageobjectmanager.getcheckoutpage();
		
	}
	

	@Then("User proceeds to Checkout and validate the {string} in checkout page")
	public void user_proceeds_to_checkout_and_validate_the_in_checkout_page(String string) throws InterruptedException {
		System.out.println("checkoutstepdefination");
	checkoutpage.cartimg();
	System.out.println(string);
	Thread.sleep(2000);
	}

	@Then("User has ability to enter promocode and place the order")
	public void user_has_ability_to_enter_promocode_and_place_the_order() {
	Assert.assertTrue(checkoutpage.promocodedis());
	Assert.assertTrue(checkoutpage.verifyplanorder());
	}
}
