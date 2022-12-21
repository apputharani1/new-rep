package org.newp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws AWTException {
		 System.setProperty("webelement.chrome.driver", "C:\\\\Users\\\\welcome\\\\eclipse-workspace\\\\Selenum\\\\broser\\\\chromedriver.exe");
   		WebDriver driver=new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   		driver.get("http://greenstech.in/selenium-course-content.html");
   		
   		Actions ac=new Actions(driver);
   		WebElement move = driver.findElement(By.xpath("(//h2[@class='mb-0'])[7]"));
		ac.moveToElement(move).perform();
		Robot r =new Robot();
		ac.contextClick(move).perform();
		r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    for(int i=0;i<9;i++) {
	    	
	    	r.keyPress(KeyEvent.VK_DOWN);
		    r.keyRelease(KeyEvent.VK_DOWN);
	    }
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);	
	    	
		
		
		
	}

}
