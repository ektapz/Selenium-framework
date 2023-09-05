package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlesearchpage {
	 public static WebDriver driver;
	//WebDriver driver;
	@Given("browser is open")
	public void browser_is_open() {
	   System.out.println("Browser is open"); 
	  // String projectPath= System.getProperty("user.dir");
	 //  System.out.println("projectpath");
	  //System.setProperty("WebDriver.Chrome.Driver","C:/Users/Ekta/eclipse-workspace/BDDFramework/src/test/resources/Drivers/chromedriver.exe");
	   
	   WebDriverManager.chromedriver().setup();
	 ChromeOptions Options=new ChromeOptions();
	  Options.addArguments("--remote-allow-origins=*");
	   WebDriver  driver=new ChromeDriver(Options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 //driver.manage().window().maximize();
	}

	@And("user is on google search place")
	public void user_is_on_google_search_place() {
	
	driver.navigate().to("https://www.google.com");
	System.out.println("google page");
	}

	@When("user enter text on search box.")
	public void user_enter_text_on_search_box() {
	   driver.findElement(By.id("input")).sendKeys("Automation Step by Step");
	   System.out.println("searchbutton");
	}

	@And("hit enter")
	public void hit_enter() {
	  driver.findElement(By.id("input")).sendKeys(Keys.ENTER);
	  System.out.println("hit the button");
	}

	@Then("google navigate to search page")
	public void google_navigate_to_search_page() {
	    driver.getPageSource().contains("Online Courses");
	    System.out.println("navigate to page");
	}
}
