package locatorSession;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//step 1
WebDriver driver=new ChromeDriver();

//pass url to browser
//driver.get("https://www.saucedemo.com/");
driver.get("https://saucelabs.com/");
driver.manage().window().maximize();
 
// locate by name
//driver.findElement(By.name("user-name")).sendKeys("standard_user");
//locate by id
//driver.findElement(By.id("user-name")).sendKeys("Rose");
//locate by class
//driver.findElement(By.className("form_input")).sendKeys("ajmal");
//locate password field
//driver.findElement(By.id("password")).sendKeys("secret_sauce");
// locate button
//driver.findElement(By.id("login-button")).click();

//driver.findElement(By.className("submit-button")).click();
//
//
//// locating element by linkText
//driver.findElement(By.linkText("Pricing")).click();
//
////partialLinkText
//driver.findElement(By.linkText("Pric")).click();

//locating or capturing multiple webElements by className or tagName

//List <WebElement> sliderLinks=driver.findElements(By.className("swiper-slide"));
//
//sliderLinks.size();
//System.out.println("total number of links "+sliderLinks.size());

////locating elements by tagName
//List <WebElement> links=driver.findElements(By.tagName("a"));
//System.out.println("total number of links are "+links.size());

//locating elements by tagName
List <WebElement> links=driver.findElements(By.tagName("img"));
System.out.println("total number of images are "+links.size());
	}

}
