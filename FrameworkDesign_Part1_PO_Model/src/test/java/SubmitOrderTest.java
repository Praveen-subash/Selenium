import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pageobjects.CartPage;
import com.pageobjects.CheckoutPage;
import com.pageobjects.ConfirmationPage;
import com.pageobjects.LandingPage;
import com.pageobjects.ProductCatalogue;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitOrderTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeOptions e = new EdgeOptions();
		e.addArguments("start-maximized");	
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(e);
		
		//Landing page
		LandingPage landingPage = new LandingPage(driver);  //**7
		landingPage.goTo(); //**11
		ProductCatalogue productCatalogue = landingPage.loginApplication("Tapamth@gmail.com","Tapamth1!0");  //**9
		//In 61 we have created a object for the next page and returning here.
		
		//Product catalog page 	
		String[] arr = {"IPHONE", "ZARA"};
		List<String> aList = Arrays.asList(arr);
//		ProductCatalogue productCatalogue =  new ProductCatalogue();
//		productCatalogue = new ProductCatalogue(driver); //*24
		productCatalogue.getProductList();
		productCatalogue.addProductsToCart(aList);  //**30
		CartPage cartPage = productCatalogue.goToCartPage(); //**34 as per inheritance even productCatalogue has access
		//In 63 we have created a object for the next page and returning here.
		
		//Cart Page
//		CartPage cartPage = new CartPage(driver); //**35
		cartPage.waitForCartPageToLoad();  //**36
		cartPage.verifyProductDisplay(aList);  //**37
		CheckoutPage checkout = cartPage.goToCheckout(); //**43
		//In 64 we have created a object for the next page and returning here.
		
		//Checkout Page
//		CheckoutPage checkout = new CheckoutPage(driver);  //**48
		checkout.selectCountry("India");
		ConfirmationPage confirmationPage = checkout.submitOrder();  //**53
		//In 65 we have created a object for the next page and returning here.
		
		//Confirmation Page
//		ConfirmationPage confirmationPage = new ConfirmationPage(driver); //**59
		Assert.assertEquals(confirmationPage.getConfirmationMessage(), "THANKYOU FOR THE ORDER.");  //**60

	}

}
