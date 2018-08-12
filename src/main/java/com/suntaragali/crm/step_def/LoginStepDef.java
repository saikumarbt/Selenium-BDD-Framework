package com.suntaragali.crm.step_def;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {
	WebDriver driver;
	private WebElement contactsLink;
	private WebElement newContactLink;
	private WebElement firstName;
	private WebElement lastName;
	private WebElement positionCompany;
	private WebElement saveBtn;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.freecrm.com");
	    
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title = driver.getTitle();
	    System.out.println(title);
	    assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	    
	}

	// Regular Expression to be used for parameterizing: \"([^\"]*)\" or \"(.*)\"
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", loginBtn);
		
	}

	@Then("^user is on Homepage$")
	public void user_is_on_Homepage(){
		String homePage = driver.getTitle();
		   System.out.println(homePage);
		   assertEquals("CRMPRO",homePage);
		   
	}
	
	@Then("^user moves to new Contact page$")
	public void user_moves_to_new_Contact_page() {
		driver.switchTo().frame("mainpanel");
		contactsLink = driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]"));
		newContactLink = driver.findElement(By.xpath("//a[contains(text(), 'New Contact')]"));
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
	}
	
	@Then("^user enters contact details like \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_details_like_and_and(String firstname, String lastname, String position){
	    firstName = driver.findElement(By.id("first_name"));
	    lastName =driver.findElement(By.id("surname"));
	    positionCompany = driver.findElement(By.id("company_position"));
	    saveBtn = driver.findElement(By.xpath("//input[@type='submit' and @value='Save']"));
	    firstName.sendKeys(firstname);
	    lastName.sendKeys(lastname);
	    positionCompany.sendKeys(position);
	    saveBtn.click();
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
}
