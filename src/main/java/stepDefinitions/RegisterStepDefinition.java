package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class RegisterStepDefinition {

	WebDriver driver;
	
	@Given("^user is already on Home Page$")
	public void user_is_already_on_Home_Page() {
	   
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("http://127.0.0.1:8000/");
	}
	
	@When("^title of Home page is Travello$")
	public void title_of_Home_page_is_Travello() {
	    
		String title = driver.getTitle();
		Assert.assertEquals("Travello", title);
	}
	
	@Then("^user click on register link$")
	public void user_click_on_register_link() {	
		driver.findElement(By.linkText("Register")).click();	
	}
	
	@Then("^user is on Registration Page$")
	public void user_is_on_Registeration_Page() {
	  String title = driver.getTitle();
	  Assert.assertEquals("Registration", title);
	}

	@Then("^user enters registrataion details$")
	public void user_enters_registrataion_details_and_and_and_and_and(DataTable dataTbl)  {
	    List<List<String>> data = dataTbl.raw();
	    
		driver.findElement(By.name("first_name")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("last_name")).sendKeys(data.get(0).get(1));
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(2));
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(3));
		driver.findElement(By.name("password1")).sendKeys(data.get(0).get(4));
		driver.findElement(By.name("password2")).sendKeys(data.get(0).get(5));	    	
    
	}
	
	@Then("^user clicks on submit button$")
	public void user_clicks_on_submit_button() {
		WebElement submitbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", submitbtn);
	}
	
	@Then("^user moves to login page$")
	public void user_moves_to_login_page() {
	  
		String title = driver.getTitle();
		Assert.assertEquals("Login Page", title);
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
	   driver.close();
	}

	
}
