package org.sample.jsscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\091819\\JavaScriptExProgram\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		WebElement passWord = driver.findElement(By.id("pass"));
		WebElement btnclick = driver.findElement(By.xpath("//input[@value='Log In']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','vishnupriya')", userName);
		js.executeScript("arguments[0].setAttribute('value','Welcome@123')", passWord);
		String text = (String)js.executeScript("return arguments[0].  getAttribute('value')", userName);
		System.out.println(text);	
		String pass = (String)js.executeScript("return arguments[0].getAttribute('value')", passWord);
		System.out.println(pass);
		js.executeScript("arguments[0].click()", btnclick);
		
	}

}
