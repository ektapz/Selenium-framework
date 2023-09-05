package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe {

	
		 static WebDriver driver;
			public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
		ChromeOptions Options=new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(Options);
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();//*normalize space is for removing for writh xpath which text has space
       
		WebElement outerframe=driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
		driver.switchTo().frame(outerframe);
		
		 WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
			driver.switchTo().frame(innerframe);
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("WELCOME");
	}

}
