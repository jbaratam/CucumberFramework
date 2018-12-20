package managers;



import org.openqa.selenium.WebDriver;

import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.ConfirmationPage;
import pageObjects.HomePage;
import pageObjects.ProductListingPage;





public class PageObjectManager {

	private WebDriver driver;

	

	private CartPage cartPage;

	private HomePage homepage;

	private CheckoutPage checkoutPage;

	private ConfirmationPage confirmationPage;

	private ProductListingPage productlistingpage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	

	

	

	public CartPage getCartPage() {

		return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;

	}

	

	public CheckoutPage getCheckoutPage() {

		return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;

	}







	public HomePage getHomePage() {
		
		// TODO Auto-generated method stub
		return (homepage == null)? homepage = new HomePage(driver): homepage;
	}







	public ProductListingPage getProductListingPage() {
		// TODO Auto-generated method stub
		return (productlistingpage==null)? productlistingpage= new ProductListingPage(driver):productlistingpage;
	}
}