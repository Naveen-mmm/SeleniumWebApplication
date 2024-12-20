package test.SeleniumWebApplication;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators1 {
	
	public void locators1()
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("nav-input nav-progressive-attribute")).sendKeys("AC");
		//driver.findElement(By.cssSelector("input[class='nav-input nav-progressive-attribute']")).sendKeys("Mobiles");
		
		// Tag and id
		//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Tv");
		
		//tag and class
		//driver.findElement(By.cssSelector("input.nav-input nav-progressive-attribute")).sendKeys("Watch");
		
		//tag and attribute
		//driver.findElement(By.cssSelector("input[aria-controls='sac-autocomplete-results-container']")).sendKeys("fridge");
		
		//tag,class and attribute
		//driver.findElement(By.cssSelector("input.nav-input nav-progressive-attribute[id='twotabsearchtextbox']")).sendKeys("Samsung");
		
		//Start-With
		//driver.findElement(By.cssSelector("input[aria-controls^='s']")).sendKeys("lights");
		//driver.findElement(By.cssSelector("input[class^='nav-inp']")).sendKeys("purse");
		
		//End-With
		//driver.findElement(By.cssSelector("input[aria-expanded$='ue']")).sendKeys("soap");
		//driver.findElement(By.cssSelector("input[aria-autocomplete$='st']")).sendKeys("soap");
		
		//Contain 
		
		//driver.findElement(By.cssSelector("input[aria-label*='azo']")).sendKeys("stove");
		
		
		//Xpath -Text : (//tagname(text()='value')
		
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locators1 obj = new Locators1();
		obj.locators1();

	}

}
