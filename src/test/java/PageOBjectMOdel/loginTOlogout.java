package PageOBjectMOdel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class loginTOlogout {

	
	WebDriver driver;
	
	//constructor
	
	  loginTOlogout(WebDriver driver){
		this.driver=driver;
	}
	
	//locators
	 By user_id = By.id("user-name");
	 By user_password = By.id("password");
	 By Login= By.id("login-button");
	 By sort=By.cssSelector("select.product_sort_container");
	 By shirt=By.xpath("//*[text() = \"Sauce Labs Bolt T-Shirt\"]");
	 By cart =By.xpath("//*[text() = \"Add to cart\"]");
	 By carts= By.xpath("//*[text() = \"1\"]");
	 By rmoveproduct=By.xpath("//*[text() = \"Remove\"]");
	 By shopping=By.xpath("//*[text() = \"Continue Shopping\"]");
	 By addcart=By.xpath("(//*[text() = \"Add to cart\"])[4]");
	 By addcarts=By.xpath("//*[text() = \"1\"]");
	 By checksout=By.xpath("//*[text() = \"Checkout\"]");
	 By fname=By.xpath("//input[@placeholder = \"First Name\"]");
	 By lname = By.xpath("//input[@placeholder = \"Last Name\"]");
	 By zip=By.xpath("//input[@placeholder = \"Zip/Postal Code\"]");
	 By continuee=By.xpath("//input[@value = \"Continue\"]");
	 By finishes=By.xpath("//*[text() = \"Finish\"]");
	 By home=By.xpath("//*[text() = \"Back Home\"]");
	 By menu=By.xpath("//*[text() = \"Open Menu\"]");
	 By logoutt=By.id("logout_sidebar_link");
	 
	//action methods

	public void setUSername(String username) {
		driver.findElement(user_id).sendKeys(username);
	}
	
	public void setPassword(String password) {
		driver.findElement(user_password).sendKeys(password);
	}
	
	public void submit() {
		driver.findElement(Login).click();
	}
	
	public void sort() {
		driver.findElement(sort).click();
	    new Select(driver.findElement(sort)).selectByVisibleText("Name (Z to A)");
	    driver.findElement(sort).click();
	    new Select(driver.findElement(sort)).selectByVisibleText("Price (low to high)");
	    driver.findElement(shirt).click();
		
	}
	
	public void adding() throws Exception {
		driver.findElement(cart).click();
	    driver.findElement(carts).click();
	    driver.findElement(rmoveproduct).click();
	    driver.findElement(shopping).click();
		driver.findElement(addcart).click();
	    driver.findElement(addcarts).click();
	    driver.findElement(checksout).click();
	    driver.findElement(fname).click();
	    driver.findElement(fname).clear();
	    driver.findElement(fname).sendKeys("danial");
	    driver.findElement(lname).clear();
	    driver.findElement(lname).sendKeys("hussain");
	    driver.findElement(zip).click();
	    driver.findElement(zip).clear();
	    driver.findElement(zip).sendKeys("34384");
	    driver.findElement(continuee).click();
	    driver.findElement(finishes).click();
	    driver.findElement(home).click();
	    driver.findElement(menu).click();
	    Thread.sleep(2000);
	    driver.findElement(logoutt).click();
	}


}
	

	
	
	
	
	
	
	
	
	

