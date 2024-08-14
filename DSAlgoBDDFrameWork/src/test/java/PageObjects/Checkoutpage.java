package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkoutpage {
private By value_pdt=By.xpath("//h4[text()='Tomato - 1 Kg']/..//input[@class='quantity']");	
private By clickplussign=By.xpath("//h4[text()='Tomato - 1 Kg']/..//a[text()='+']");
private By clickminussign=By.xpath("//h4[text()='Tomato - 1 Kg']/..//a[text()='-']");
private By Add_to_cart=By.xpath("//h4[text()='Tomato - 1 Kg']/..//button[text()='ADD TO CART']");
private By cart_img=By.xpath("//img[@alt='Cart']");
private By proceed_checkout=By.xpath("//button[text()='PROCEED TO CHECKOUT']");
private By promo_code=By.xpath("button.promoBtn");
private By apply_btn=By.xpath("//button[text()='Apply']");
private By place_order=By.xpath("//button[text()='Place Order']");
WebDriver driver;
public Checkoutpage(WebDriver driver) {
	this.driver=driver;
}
public void value_count() {
	WebElement find_value=driver.findElement(value_pdt);
	String value=find_value.getAttribute("value");
	int num=Integer.parseInt(value);
	int count=num;
	boolean x=true;
	while(x) {
		if(count<4) {
			driver.findElement(clickplussign).click();
			count++;
		}
		else if(count>4) {
		  driver.findElement(clickminussign).click();
		  count--;
		}
		else {
			System.out.println(count);
			x=false;
		}
		
		
		}
	}
public void Add_cart() {
	driver.findElement(Add_to_cart).click();
}public void cartimg() {
	driver.findElement(cart_img).click();
	driver.findElement(proceed_checkout).click();
}public boolean promocodedis() {
	return driver.findElement(apply_btn).isDisplayed();
	
}public boolean verifyplanorder() {
	return driver.findElement(place_order).isDisplayed();
}

}

