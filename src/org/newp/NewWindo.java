package org.newp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindo {
	  public static void main(String[] args) throws InterruptedException {
			
    	  System.setProperty("webelement.chrome.driver", "C:\\\\Users\\\\welcome\\\\eclipse-workspace\\\\Selenum\\\\broser\\\\chromedriver.exe");
  		WebDriver driver=new ChromeDriver();
  		driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
  		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone",Keys.ENTER);
  		WebElement aa = driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (64GB) - White']"));
  		aa.click();
  		Thread.sleep(3000);
        Set<String> windowHandles = driver.getWindowHandles();
  		List<String> a1= new ArrayList<String>(windowHandles);
  		driver.switchTo().window(a1.get(0));
  		String url = driver.getCurrentUrl();
  		System.out.println(url);
  		
  		
  		
  		
  		
	  }

}
