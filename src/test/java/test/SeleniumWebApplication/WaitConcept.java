package test.SeleniumWebApplication;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WaitConcept {
	
	public void waitexample() throws InterruptedException
	{
		
		WebDriver driver = new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		//Thread.sleep(5000);
		
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.amazon.in/");
		//driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).sendKeys("Mobile");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		// ID,Name,ClassName
		driver.findElement(By.id("email")).sendKeys("naveen");
		//Thread.sleep(5000);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("Selenium");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys("facebook");
		//driver.findElement(By.class("inputtext _55r1 _6luy _9npi")).clear();
		driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy _9npi']")).clear();
		driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy _9npi']")).sendKeys("gmail");
		
		
		//Link Text, Partial Link Text
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.partialLinkText("got")).click();
		
		//cssSelectors
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).clear();
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("Attribute");
		driver.findElement(By.cssSelector("input[aria-label='Email address or phone number']")).clear();
		
		// type
		
	    // 1) Tag and ID
		driver.findElement(By.cssSelector("input#email")).sendKeys("Tad and ID");
		driver.findElement(By.cssSelector("input#email")).clear();
		
		//2) Tag and Class
		//driver.findElement(By.cssSelector("input#inputtext _55r1 _6luy")).sendKeys("Tag and class");
		
		//3) tag and attribute
		
		//driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy']")).sendKeys("Tag and Attribute");
		//driver.findElement(By.cssSelector("input[autofocus='1']")).sendKeys("Tag and attribute-1");
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Tag and attribute-2");
		driver.findElement(By.cssSelector("input[id='email']")).clear();
		
		//4) Tag,Class and Attribute
		
		//driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy[data-testid='royal_email']")).sendKeys("Tag,class and Attribute");
		//driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy[id='email']")).sendKeys("Tag class and attribute");
		
		//5) Start-with
		driver.findElement(By.cssSelector("input[class^='inputte']")).sendKeys("Start-With");
		driver.findElement(By.cssSelector("input[class^='inputte']")).clear();
		
		//End-with
		driver.findElement(By.cssSelector("input[class$='_6luy']")).sendKeys("End-with");
		driver.findElement(By.cssSelector("input[class$='uy']")).clear();
		
		//Contain
		driver.findElement(By.cssSelector("input[data-testid*='ma']")).sendKeys("baby shop");
		driver.findElement(By.cssSelector("input[data-testid*='ma']")).clear();
		
		
		//Xpath - Relative X Path
		
		//1) Basic X Path (//tagname[@attribute='attributevalue'])
		
		driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']")).sendKeys("RRR");
		driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']")).clear();
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("GOAT");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).clear();
		
		//2) AND or OR -- AND (//tagname[@attribute1='value1' and @attribute2='value2'])
		// OR                 (//tagname[@attribute1='value1' OR  @attribute2='value2 '])
		
		driver.findElement(By.xpath("//input[@type='text' and @autofocus='1']")).sendKeys("And");
		driver.findElement(By.xpath("//input[@type='text' and @autofocus='1']")).clear();
		
		//OR
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number' or @id='email']")).sendKeys("OR");
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number' or @id='email']")).clear();
		
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number' or @id='emailsrdd']")).sendKeys("OR -2");
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number' or @id='emailsrdd']")).clear();
		
		//3)Starts-with (//tagename[starts-with(@attribute,'starting value of the attribute')]
		driver.findElement(By.xpath("//input[starts-with(@class,'inpu')]")).sendKeys("Xpath-Starts-with");
		driver.findElement(By.xpath("//input[starts-with(@class,'in')]")).clear();
		
		//4) Text  //tagname[text()='text of the web Element']
		
		//driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
		//5) contains : //tagname[contains(@attriubute,'partial value')]
		
		driver.findElement(By.xpath("//input[contains(@class,'5r')]")).sendKeys("Madurai");
		driver.findElement(By.xpath("//input[contains(@class,'5r')]")).clear();
		
		
		// Explicit Wait
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("email")));
		driver.findElement(By.id("email")).sendKeys("Explicit-Wait");
		
		
		
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WaitConcept obj = new WaitConcept();
		obj.waitexample();
		
		
				
		
		
		

	}

}
