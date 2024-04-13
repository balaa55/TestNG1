package org.baseutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("browser launch");
		driver=new ChromeDriver();
driver.manage().window().maximize();
	
	
	}
	public static void type(WebElement element, String text) {
		element.sendKeys(text);
}
}
