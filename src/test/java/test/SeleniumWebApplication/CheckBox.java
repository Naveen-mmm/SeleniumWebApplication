package test.SeleniumWebApplication;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {
	
	public void checkboximp() throws InterruptedException
	{
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		/*driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//*[starts-with(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')]")).click();
		Thread.sleep(1000);
		String s = driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//*[starts-with(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')]")).getAttribute("class");
		System.out.println("String :"+s);
		if(s.contains("ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active"))
		{
			driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//*[starts-with(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')]")).click();

			
		}
		
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		Thread.sleep(2000);
		String e = driver.findElement(By.className("ui-growl-item")).getText();
	    System.out.println(e);
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ui-growl-item")));
	    driver.findElement(By.className("ui-toggleswitch-slider")).click();
	    e = driver.findElement(By.className("ui-growl-item")).getText();
	    System.out.println(e);*/
		
		
		driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//*[starts-with(@class,'ui-chkbox-box')]")).click();
		String a=driver.findElement(By.className("ui-state-focus")).getAttribute("class");
		System.out.println(a);
		if(a.contains("ui-state-focus"))
		{
			driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//*[starts-with(@class,'ui-chkbox-box')]")).click();
			a=driver.findElement(By.className("ui-state-focus")).getAttribute("class");
			System.out.println(a);
			
		}

		
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='Checked']")));
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		
		
		
		
		
		
		 
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 CheckBox ch = new CheckBox();
		 ch.checkboximp();
	}

}
