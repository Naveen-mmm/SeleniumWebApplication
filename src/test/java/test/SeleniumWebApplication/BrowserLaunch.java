package test.SeleniumWebApplication;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserLaunch {
	
	public void browser()
	{
		//WebDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserLaunch obj = new BrowserLaunch();
		obj.browser();

	}

}
