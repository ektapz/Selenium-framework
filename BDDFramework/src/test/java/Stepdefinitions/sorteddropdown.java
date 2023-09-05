package Stepdefinitions;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sorteddropdown {


		 static WebDriver driver;
			public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
		ChromeOptions Options=new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(Options);
		driver.get("https://www.twoplugs.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div/nav/ul/li[2]/a")).click();
		WebElement drpelement=driver.findElement(By.name("category_id"));
		Select drpselect =new Select(drpelement);
		List<WebElement> options=drpselect.getOptions();
		
		ArrayList originallist=new ArrayList();
		ArrayList Templist=new ArrayList();
		
		for(WebElement option:options)
				{
			  originallist.add(option.getText());
			  Templist.add(option.getText());
				}
		System.out.println("original list:"+ originallist);
		System.out.println("Temp list:"+ Templist);
		
		
//		Collections.sort(Templist);//sorting
//		
//		System.out.println("original list :"+ originallist);
//		System.out.println("Temp list after sorting:"+ Templist);
//		
//		if(originallist.equals(Templist))
//		{
//			System.out.println("Dropdown sorted");
//		}
//		else
//		{
//			System.out.println("Dropdown unsorted");
//		}
		driver.close();
	}
			

}
