package org.newp;

import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Window2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","location validat");
		WebDriver driver=new ChromeDriver();
		driver.get("      ");
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		driver.findElement(By.name("name")).sendKeys("appu");
		driver.findElement(By.id("pass")).sendKeys("12345678");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("button")).click();
		
		driver.getWindowHandle();
		List<WebElement> a1 = driver.findElements(By.tagName("table"));
		for(int i=0;i<a1.size();i++) {
			WebElement a4 = a1.get(i);
			String a5 = a4.getText();
			if(a5.equals("G")) {
				System.out.println(a5);
			}
			}
        	driver.findElement(By.id("aq")).sendKeys("appu");                                                                     
        	driver.findElement(By.name("po")).click();
        	
             Alert a = driver.switchTo().alert();	
             a.accept();
             
             WebElement a6 = driver.findElement(By.id("8764"));
		      Select s=new Select(a6);
		      s.selectByIndex(2);
		      System.out.println(s);
		      JavascriptExecutor js=(JavascriptExecutor) driver;
		      WebElement ab = driver.findElement(By.id("id"));
		      js.executeScript("argument[0].scrollIntoViwe(false)",ab);
		          
		      TakesScreenshot tk=(TakesScreenshot)driver; 
		      WebElement t = driver.findElement(By.id("id"));
		  		File From = t.getScreenshotAs(OutputType.FILE);
		  		
		  		
		  		
		
		
	}

}
