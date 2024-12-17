package test.SeleniumWebApplication;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
public class KeyNavigation {

	public void key()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/"); // driver.get("");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KeyNavigation obj = new KeyNavigation();
		obj.key();

	}

}
