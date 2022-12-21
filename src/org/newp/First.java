package org.newp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class First {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenum\\broser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement name = driver.findElement(By.id("email"));
				name.sendKeys("appu");
		Actions ac=new Actions(driver);		
		ac.doubleClick(name).perform();
		ac.contextClick(name).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		for(int i=0;i<7;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
			r.keyPress(KeyEvent.VK_ENTER);	
			r.keyRelease(KeyEvent.VK_ENTER);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);	
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_V);	
	}

}
