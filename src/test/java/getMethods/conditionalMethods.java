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

				//isDisplayed()
				
		WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));

		System.out.println("status of logo: "+logo.isDisplayed());
		
		
		//isEnabled()
		
		boolean status= driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		
		System.out.println("status of input box : "+status);
		
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("before selection...");
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		male.click();
		
		System.out.println("after selection...");
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
	}

}
