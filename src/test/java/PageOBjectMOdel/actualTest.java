package PageOBjectMOdel;



import org.junit.BeforeClass;

//import org.junit.AfterClass;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class actualTest {
static WebDriver driver;
loginTOlogout lp;



@BeforeClass
@Given("i am on the login page")
public void i_am_on_the_login_page() {
	WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver(); 
	driver.get("https://www.saucedemo.com/");
   
}
@Test
@When("i give the valid credentials in the input fields")
public void i_give_the_valid_credentials_in_the_input_fields() {
	lp=new loginTOlogout(driver) ;
	lp.setUSername("standard_user");
	lp.setPassword("secret_sauce");
	
    
}
@Test
@When("click on the login button")
public void click_on_the_login_button() {
	lp=new loginTOlogout(driver) ;
	lp.submit();
    }
@Test
@When("i sort the products")
public void i_sort_the_products() {
	lp=new loginTOlogout(driver) ;
    lp.sort();
   
}
@Test
@When("i add the product to cart and checkout")
public void i_add_the_product_to_cart_and_checkout() throws Exception {
	lp=new loginTOlogout(driver) ;
 	lp.adding();
    
}
@Test
@Then("my product is successfully ordered")
public void my_product_is_successfully_ordered() {
	System. out. println("successfully ordered");
    throw new io.cucumber.java.PendingException();
}
@Test
@Then("i logout from the website")
public void i_logout_from_the_website() {
	System. out. println("successfully logout");
    
}







//hits the browser and open the website
//	@BeforeClass
//	public static void setup() {
//		WebDriverManager.chromedriver().setup();
//		 driver= new ChromeDriver(); 
//		driver.get("https://www.saucedemo.com/");
//		
//	}
//	
//	//login with valid credentials
//	@Test
//	 public void testlogin() {
//		
//		lp=new loginTOlogout(driver) ;
//		lp.setUSername("standard_user");
//		lp.setPassword("secret_sauce");
//		lp.submit();
//	}
//	
//	//doing some filtering of products
//	@Test
//	public void produtFilter() {
//		lp=new loginTOlogout(driver) ;
//        lp.sort();
//	}
//	
//	//add product to cart , than remove , than add again, than checkout than logout
//	@Test
//    public void producttocart() throws Exception {
//		lp=new loginTOlogout(driver) ;
//     	lp.adding();
//	}


}
	