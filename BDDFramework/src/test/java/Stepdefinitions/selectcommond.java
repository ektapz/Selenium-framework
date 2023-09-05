package Stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectcommond {
	 static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
ChromeOptions Options=new ChromeOptions();
Options.addArguments("--remote-allow-origins=*");
driver= new ChromeDriver(Options);
driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//driver.findElement(By.xpath("//div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
//driver.findElement(By.xpath("//div/input[@type='password']")).sendKeys("admin123");
driver.findElement(By.xpath("//div[1]/div/div[2]/input")).sendKeys("ABC");
driver.findElement(By.name("lastname")).sendKeys("sql");
driver.findElement(By.id("sex-0")).click();
driver.findElement(By.id("exp-1")).click();
driver.findElement(By.id("datepicker")).sendKeys("03/30/2012");
driver.findElement(By.id("profession-1")).click();
driver.findElement(By.xpath("//div/input[@value='Selenium IDE']")).click();
//Select nameofcountrydrp=new Select(driver.findElement(By.xpath("//*[@id='continents']")));
//nameofcountrydrp.selectByVisibleText("North America");


//WebElement continenets=driver.findElement(By.xpath("//*[@id='continents']"));
//

WebElement countrydrp=driver.findElement(By.xpath("//div/select[@id='continents']"));
selectoptions(countrydrp,"North America");



	}


//Select dropdown =new Select (driver.findElement(By.className("input-xlarge")));

	
 public static void selectoptions (WebElement ele, String value)
	{
		Select drop=new Select(ele);
	  List<WebElement>alloptions=drop.getOptions();
	  for(WebElement option:alloptions)
	  {
		  if (option.getText().equals(value))
		  {
			  option.click();
		  break;
		  }
	  }
	}
	
}
