package stepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Stepdefination {
	
	WebDriver driver;
	
	@Given("AUT ,open login page")
	public void Aut_open_login_page() {
		System.setProperty("webdriver.chrome.driver","c:\\Chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://operauat.softvision.com/Account/Login?ReturnUrl=%2fTravel");
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("i enter valid UserName and Valid Password")
	public void i_enter_valid_UserName_and_Valid_Password() {
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Shivanand.chachdi");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("testing123");
		// Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("login should be successful.")
	public void login_should_be_successful() {
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    // Write code here that turns the phrase above into concrete actions
	 
	}



}
