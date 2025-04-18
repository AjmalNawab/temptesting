package getMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class getCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		//get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		//getTitle()
//		String title=driver.getTitle();
//		System.out.println("title of the page : "+title);
		System.out.println(driver.getTitle());
		
		//getCurrentUrl()
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource()
//		System.out.println(driver.getPageSource());
		
//		//getWindowHandle()
//		String windowId=driver.getWindowHandle();
//		System.out.println("window id :" +windowId);
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		//getWindowHandles()
		Set<String> multiIds=driver.getWindowHandles();
		System.out.println("window id :" +multiIds);
				
		
		
		
		
		
	
	}

}
