package xpathAxes;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class xpathAxesConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		//selecint self node
		String text=driver.findElement(By.xpath("//a[normalize-space()='Safari Indus.']/self::a")).getText();
		System.out.println("Self "+text);
		
		//selecting parent element
		text=driver.findElement(By.xpath("//a[normalize-space()='Safari Indus.']/parent::td")).getText();
		System.out.println("parent "+text);
		
		//childs
	List <WebElement> childs=driver.findElements(By.xpath("//a[normalize-space()='Safari Indus.']/ancestor::tr/child::td"));
	System.out.println("total child elements are : "+childs.size());
	
	
	// ancestor
	
	text=driver.findElement(By.xpath("//a[normalize-space()='Safari Indus.']/ancestor::tr")).getText();
	System.out.println("ansestor : "+text);
	
	//decendent //selecting all childern of the current node
	 List <WebElement> decendants=driver.findElements(By.xpath("//a[normalize-space()='Safari Indus.']/ancestor::tr/descendant::*"));
	System.out.println("number of decendant elements : " + decendants.size());

	
	//following // selecting everything in the document after closing the current node.
	 List <WebElement> following=driver.findElements(By.xpath("//a[normalize-space()='Safari Indus.']/ancestor::tr/following::tr"));
	System.out.println("number of following elements : " + following.size());

	
	//following-sibligs // selecting following-siblings.
				 List <WebElement> followingSiblings=driver.findElements(By.xpath("//a[normalize-space()='Safari Indus.']/ancestor::tr/following-sibling::tr"));
			System.out.println("number of following-sibling elements : " + followingSiblings.size());

	
	//preceding elements 
	 List <WebElement> preceding=driver.findElements(By.xpath("//a[normalize-space()='Safari Indus.']/ancestor::tr/preceding::tr"));
	System.out.println("number of precidings elements : " + preceding.size());


	}

}
