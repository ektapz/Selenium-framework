package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver","C:\\Users\\Ekta\\eclipse-workspace\\BDDFramework\\src\\test\\resources\\Drivers\\chromedriver.exe");
//ChromeDriver driver=new ChromeDriver();
	//webdriver is an java interface which is implemented by different class like chrome,firefox,edge.this classes areimplemented webdriver method
		//we need to create object for chromedriver class.which is implemented the webdriver interface or variable
		WebDriverManager.chromedriver().setup();
ChromeOptions Options=new ChromeOptions();
Options.addArguments("--remote-allow-origins=*");
WebDriver driver= new ChromeDriver(Options);
driver.get("https://www.amazon.com/");



driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/div/a")).click();
//System.out.println("Title ofthe webpage:" + driver.getTitle());

//System.out.println("Title ofthe webpage:" + driver.getCurrentUrl());
//System.out.println("Title ofthe webpage:" + driver.getPageSource());
//
//   WebElement searchstore= driver.findElement(By.id("twotabsearchtextbox"));
//   System.out.println("Display status:" + searchstore.isDisplayed());
//   System.out.println("Enabled status:" + searchstore.isEnabled());
   
   
   //selection of radio button ex for radiobutton,dropdown,checkbox
  // WebElement selectbuttonmale= driver.findElement(By.id("twotabsearchtextbox"));
  // System.out.println("male/female selected:"+ selectbuttonmale.isSelected());
   //selectbuttonmale.click();
   //navigate between two links
   //driver.get("https://www.amazon.com/");
   //driver.get("https://www.snapdeal.com/");
   //driver.navigate().back();
 //driver.navigate().forward();
 //driver.navigate().to();
 //driver.navigate().to();
   
	}

}
