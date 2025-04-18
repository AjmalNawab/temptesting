package cssLocator;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class cssLocatorsession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tagName and id
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Samsung");
////		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Samsung");
		
		//tagName and class
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Rose");
//		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Rose");
		
		
		//tagName and attribute
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Iphone");
		
		
	}

}
