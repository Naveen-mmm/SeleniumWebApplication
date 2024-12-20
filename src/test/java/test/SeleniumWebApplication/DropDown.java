package test.SeleniumWebApplication;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {
	
	public void dropdown1() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement ele = driver.findElement(By.cssSelector("select[class='ui-selectonemenu']"));
		
		Select uitool = new Select(ele);
		uitool.selectByIndex(3);
		Thread.sleep(1000);
		uitool.selectByVisibleText("Playwright");
		
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		DropDown obj = new DropDown();
		obj.dropdown1();

	}

}
