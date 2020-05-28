package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	WebDriver driver;
	
	@Given("^user is present on login page$")
	public void user_present_on_login_page()  {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Datantar\\Downloads\\Softwares\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("http://127.0.0.1:8000/");
			
	}
	
	@When("^title of login page is Travello$")
	public void title_of_login_page_is_Travello() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Travello", title);
		 
	}
	
	@Then("^click on login link$")
	public void click_on_login_link()  {
		driver.findElement(By.linkText("Login")).click();
		 
		
	}
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enter_name_and_password(String username, String password) {
		
//		driver.findElement(By.name("username")).sendKeys("admin");
//		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		 
	}
	
	@Then("^user click on submit button$")
	public void user_click_on_submit_button()  {
		WebElement submitbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", submitbtn);
		
		
	}
	
	@Then("^user is on home page$")
	public void user_on_home_page()  {
		String homepageTitle = driver.getTitle();
		System.out.println("Home page titile: " + homepageTitle);
		Assert.assertEquals("Travello", homepageTitle);
		 
	}
	
	@Then("^user is logout$")
	public void user_is_logout() {
		driver.findElement(By.linkText("Logout")).click();
	}
}
