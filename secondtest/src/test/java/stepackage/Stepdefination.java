package stepackage;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Stepdefination {
	
	protected 	WebDriver driver;
	
	@Given("AUT ,open login page")
	public void Aut_open_login_page() {
		System.setProperty("webdriver.chrome.driver","c:\\Chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://operauat.softvision.com/Account/Login?ReturnUrl=%2fTravel");
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("i enter valid {string} and Valid {string}")
	public void i_enter_valid_UserName_and_Valid_Password(String uname,String pname) {
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pname);
	
	   
	}

	@Then("login should be successful with message as {string}")
	public void login_should_be_successful_with_message_as(String msg) {
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	//	driver.findElement(By.xpath("//*[@title='Travels']"));
		
		String name=driver.getTitle();
		 assertEquals(name,msg);
		
	}
	@Then("login should be unsuccessful with message as {string}")
	public void login_should_be_unsuccessful_with_message_as(String msg){
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement Actual_error=driver.findElement(By.xpath("//li[text()='The user name or password provided is incorrect.']"));
		//String innerHTML = Actual_error.getAttribute("innerhtml");
		  //System.out.println(innerHTML);
		  //String expected_error="The user name or password provided is incorrect.";
		  assertEquals(Actual_error.getText(),msg);
	
	
	 
	}
}
	
	
	



