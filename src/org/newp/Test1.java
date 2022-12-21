package org.newp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webelement.chrome.driver", "C:\\\\Users\\\\welcome\\\\eclipse-workspace\\\\Selenum\\\\broser\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.greenstechnologys.com/");
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[text()='COURSES']"))).perform();
		ac.moveToElement(driver.findElement(By.xpath("(//a[@href='http://www.greenstechnologys.com/selenium-course-content.html']"))).build().perform();
		Robot r=new Robot();
	//	r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
	//	r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		//ac.contextClick(driver.findElement(By.xpath("((//li[@class='hover'])[2]"))).perform();

		
	}

}
