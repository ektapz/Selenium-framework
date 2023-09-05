package Stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
ChromeOptions Options=new ChromeOptions();
Options.addArguments("--remote-allow-origins=*");
WebDriver driver= new ChromeDriver(Options);
driver.get("https://www.amazon.com/");

  List<WebElement>ele= driver.findElements(By.xpath("//*[@id='navFooter']/div[1]/div//li"));
  System.out.println("elementsele:" + ele.size());
for (WebElement elements:ele)
{
	System.out.println(elements.getText());
}


//getattribute method means to getting the value of attribute from webements after inspect like id=email,class=together so here 
//value is email and together.and gettext give u innner text value lie email=abc2gmail.com>sale</input>,so sale is inner text.
//WebElement emailinputbox=driver.findElement(By.id("ap_email"));
//getattribute fetches the text contain by an attributein an html documents
//caturing text from inputbox
//System.out.println("result from getattribute:" + emailinputbox.getAttribute("id"));

//System.out.println("result from getattribute:" + emailinputbox.getText());
	}

}
