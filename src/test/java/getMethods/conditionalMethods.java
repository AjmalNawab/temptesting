package getMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class conditionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				WebDriver driver= new ChromeDriver();
				
				//get(url)
				driver.get("https://demo.nopcommerce.com/register");
				driver.manage().window().maximize();
				
				
				//isDisplay()
				
				WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
				System.out.println("Status of element:  "+logo.isDisplayed());
				
				
				//isEnabled
				Boolean sts=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
				
				System.out.println("Status of input box:  "+sts);
				
				//isSelected
				
				WebElement Female=driver.findElement(By.xpath("//input[@id='gender-female']"));
				
				WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
				
				
				System.out.println("Before selecting...");
				System.out.println(male.isSelected());
				System.out.println(Female.isSelected());
				
//				male.click();
				Female.click();

				System.out.println("after selecting...");
				System.out.println(male.isSelected());
				System.out.println(Female.isSelected());
	}

}
