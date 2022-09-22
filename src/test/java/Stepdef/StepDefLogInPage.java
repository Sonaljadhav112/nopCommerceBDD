package Stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefLogInPage {
    WebDriver driver;
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
	}
	@When("User open URL {string}")
	public void user_open_url(String  url) {
		driver.get(url);
	   
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String id, String pw) throws InterruptedException {
		 
		WebElement emailid=driver.findElement(By.xpath("//input[@id='Email']"));
		emailid.clear();
		Thread.sleep(2000);
		emailid.sendKeys(id);
		WebElement pass=driver.findElement(By.xpath("//input[@id='Password']"));
		pass.clear();
		Thread.sleep(2000);
		pass.sendKeys(pw);
	   
	}
	@When("Click on Login button")
	public void click_on_login_button() throws InterruptedException {
		WebElement loginbtn=driver.findElement(By.xpath("//button[text()='Log in']"));
        loginbtn.click();  
        Thread.sleep(8000);
	}
	@Then("Page title should be {string}")
	public void page_title_should_be(String etitle) {
        String Atitle=driver.getTitle();
        Assert.assertEquals(Atitle, etitle);
	}
	@Then("close browser")
	public void close_browser() {

		driver.close();
	}



}
