package com.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import com.page.object.model.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	WebDriver driver;

	@Given("Open browser and go to application")
	public void open_browser_and_go_to_application() {
		// code
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--ignore-ssl-errors=yes");
		options.addArguments("--ignore-certificate-errors");
		 driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dolly/Downloads/dev_online%20Banking%20monthly_yearly%20statement.html");

	}

	@When("put valid user name")
	public void put_valid_user_name() {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Batch34");

	}

	@When("put valid password value")
	public void put_valid_password_value() {
		driver.findElement(LoginPage.password).sendKeys("student123@");

	}

	@When("cleck login button")
	public void cleck_login_button() {
		driver.findElement(LoginPage.logIn).click();

	}

	@Then("logout button should there")
	public void logout_button_should_there() {

		SoftAssert sf = new SoftAssert();
		sf.assertTrue(driver.findElement(LoginPage.logOut).isDisplayed());
		sf.assertAll();

	}

	@When("put invalid user")
	public void put_invalid_user() {
		driver.findElement(By.xpath("//*[@id ='username']")).sendKeys("Batch43");

	}

	@When("put invalid password")
	public void put_invalid_password() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("student");

	}

	@When("cleck login")
	public void cleck_login() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

	@Then("alart msg showed invalid username or pasword")
	public void alart_msg_showed_invalid_username_or_pasword() {

		Alert alert = driver.switchTo().alert();
		String alertMsg = alert.getText();
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(alertMsg, "Invalid username or password");

	}

	@When("put invalid user name")
	public void put_invalid_user_name() {
		driver.findElement(By.xpath("//*[@id ='username']")).sendKeys("");
	
	}

	@When("put invalid password value")
	public void put_invalid_password_value() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("");

	}

	@When("put null user")
	public void put_null_user() {
		driver.findElement(By.xpath("//*[@id ='username']")).sendKeys("");

	}

	@When("put null password")
	public void put_null_password() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("");
	}
	@When("Click login3")
	public void click_login3() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	    
	}

	}
	

