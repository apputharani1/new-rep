package org.newp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Freame1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\eclipse-workspace\\\\Selenum\\\\broser\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.switchTo().frame("frame1");
        driver.findElement(By.xpath("//b[@id='topic']//following::input")).sendKeys("appu");
        
      driver.switchTo().frame("frame3");
      driver.findElement(By.id("a")).click();
      driver.switchTo().defaultContent();
      
      driver.switchTo().frame("frame2");
      WebElement aa = driver.findElement(By.id("animals"));
      Select sc=new Select(aa);
      sc.selectByIndex(2);
        
        
		
		
		
		
		
		
		
	}

}
