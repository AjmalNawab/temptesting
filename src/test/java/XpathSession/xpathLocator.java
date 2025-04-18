package XpathSession;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class xpathLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://demo.nopcommerce.com/");
driver.manage().window().maximize();


////xpath with and operator
//
//driver.findElement(By.xpath("//input[@name='q' and @placeholder='Search store']")).sendKeys("Mobile");

////xpath with or operator
//
//driver.findElement(By.xpath("//input[@name='q' or @placeholder='Search Store']")).sendKeys("Samsung");

//
////xpath with  inner text
//driver.findElement(By.xpath("//*[text()='Facebook']")).click();


////xpath with  inner text without linkText
//boolean displayStatus=driver.findElement(By.xpath("//*[text()='News']")).isDisplayed();
//System.out.println(displayStatus);
//
//String text=driver.findElement(By.xpath("//*[text()='News']")).getText();
//System.out.println(text);


////xpath with  contains method
//driver.findElement(By.xpath("//input[contains(@aria-label,'store')]")).sendKeys("iphone");


////xpath with  starts-with  method
driver.findElement(By.xpath("//input[starts-with(@aria-label,'Search')]")).sendKeys("any phone");


	}

}
