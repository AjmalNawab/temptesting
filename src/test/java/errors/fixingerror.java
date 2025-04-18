package errors;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class fixingerror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();

        

        // Step 2: Open URL

        driver.get("https://www.saucedemo.com/");

        //Click a button

        driver.findElement(By.id("user-name")).click();

        //Enter Text in Input Field:

        driver.findElement(By.name("user-name")).sendKeys("admin");
		
	}

}

