package test.SeleniumWebApplication;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
public class RadioButton {
	
	public void radio()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		
		driver.findElement(By.xpath("(//*[@id='j_idt87:console1']//*[starts-with(@class,'ui-radiobutton-icon')])[3]")).click();
		
		
		  String q =driver.findElement(By.xpath("(//*[@id='j_idt87:console2']//*[starts-with(@class,'ui-radiobutton-box')])[3]")).getAttribute("class");
		  System.out.println(q);
		  if(q.contains("ui-state-active"))
		  {
			  System.out.println("Yes");
			  
		  }
		  else
		  {
			  System.out.println("No");
		  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RadioButton r = new RadioButton();
		r.radio();
;	}

}
