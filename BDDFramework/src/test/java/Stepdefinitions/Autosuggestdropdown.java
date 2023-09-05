package Stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestdropdown {

	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
	ChromeOptions Options=new ChromeOptions();
	Options.addArguments("--remote-allow-origins=*");
	driver= new ChromeDriver(Options);
	driver.get("https://www.bing.com/");
	//driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.findElement(By.id("sb_form_q")).sendKeys("Selenium");
	List<WebElement> list=driver.findElements(By.xpath("//span[@class='sa_tm_text']"));
	System.out.println("sizeof list:"+list.size());
	
	for(WebElement listitem:list)
	{
		if(listitem.getText().equals("selenium webdriver"))
		{
			listitem.click();
			break;
		}
	}
//	driver.findElement(By.id("APjFqb")).sendKeys("java tutorial");
//	Thread.sleep(3000);
//	List<WebElement> list= driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']/div[1]/span"));
//	System.out.println("sizeof list:"+ list.size());
//	for(WebElement listitem:list)
//		{
//			if(listitem.getText().equals(" for beginners"))
//			{
//				listitem.click();
//				break;
//			}
//		}
	}

}
