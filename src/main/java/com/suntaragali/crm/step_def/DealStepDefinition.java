package com.suntaragali.crm.step_def;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealStepDefinition {
	private WebDriver driver;
	private WebElement contactsLink;
	private WebElement newContactLink;
	
	@Given("^user is on Login Page$")
	public void user_is_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.freecrm.com");
	    
	}
	
	@When("^title page is Free CRM$")
	public void title_page_is_Free_CRM() {
		String title = driver.getTitle();
	    System.out.println(title);
	    assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	    
	}

	// Regular Expression to be used for parameterizing: \"([^\"]*)\" or \"(.*)\"
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		List<List<String>> data = credentials.raw();
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}
	
	@Then("^user clicks Login button$")
	public void user_clicks_Login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", loginBtn);
		
	}

	@Then("^user is in Homepage$")
	public void user_is_in_Homepage(){
		String homePage = driver.getTitle();
		   System.out.println(homePage);
		   assertEquals("CRMPRO",homePage);
		   
	}

	
	@Then("^user moves to new deals page$")
	public void user_moves_to_new_deals_page() {
		driver.switchTo().frame("mainpanel");
		contactsLink = driver.findElement(By.xpath("//a[contains(text(), 'Deals')]"));
		newContactLink = driver.findElement(By.xpath("//a[contains(text(), 'New Deal')]"));
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
	}

	@Then("^user enters deals details$")
	public void user_enters_deals_details(DataTable dealData) {
	    List<List<String>> data = dealData.raw();
	    driver.findElement(By.id("title")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.id("amount")).sendKeys(data.get(0).get(1));
	    driver.findElement(By.id("probability")).sendKeys(data.get(0).get(2));
	    driver.findElement(By.id("commission")).sendKeys(data.get(0).get(3));
	    driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	}
	
	@Then("^close browser$")
	public void close_browser() {
		driver.quit();
	}
}
