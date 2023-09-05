package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autocompletedropdown {

	

		 static WebDriver driver;
			public static void main(String[] args) throws InterruptedException {
				WebDriverManager.chromedriver().setup();
		ChromeOptions Options=new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(Options);
		driver.get("https://www.twoplugs.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		WebElement searchbox=driver.findElement(By.id("autocomplete"));
		searchbox.clear();
		searchbox.sendKeys("Texas");
		String text;
		do
		{
			searchbox.sendKeys(Keys.ARROW_DOWN);
			text=searchbox.getAttribute("value");
			if (text.equals("Texas City, TX, USA"))
			{
				searchbox.sendKeys(Keys.ENTER);
				break;
			}
		//Arraylist is a class which is implemented list interface.	
		}while(!text.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
