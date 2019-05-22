package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModels.login_PageOModels;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login_StepDefinition {
	
	WebDriver driver;
	
	@Before
	
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		
	}
	
	
	@Given("User should be on the login page")
	public void user_should_be_on_the_login_page() {
	   String title = driver.getTitle();
	   System.out.println("Your are on the login page " + title );
	}

	@When("user should write on the email filed the email and password")
	public void user_should_write_on_the_email_filed_the_email_and_password() {
		login_PageOModels login = new login_PageOModels(driver);
		login.email.sendKeys("Tester");
		login.password.sendKeys("test");
		
	}

	@Then("user should click the user button")
	public void user_should_click_the_user_button() {
		login_PageOModels login = new login_PageOModels(driver);
		login.submitButton.click();
	}

	@Then("user should login successfully")
	public void user_should_login_successfully() {
		 String pageTitile = driver.getTitle();
		 System.out.println("your title is " + pageTitile+ " you loged successfully");
	}

	@After
	public void CloseUp() {
		driver.close();
		driver.quit();
	}

}
