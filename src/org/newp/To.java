package org.newp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("driver.chrome.driver", "C:\\\\Users\\\\welcome\\\\eclipse-workspace\\\\Selenum\\\\broser\\\\chromedriver.exe");
	
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
       // driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // driver.navigate().to("https://www.flipkart.com/");
       // driver.navigate().refresh();
       // driver.navigate().back();
        
        WebElement a = driver.findElement(By.id("email"));
         boolean a1 = a.isDisplayed();
		System.out.println(a1);
		
		WebElement a2 = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		boolean a3 = a2.isEnabled();
		System.out.println(a3);
		
		a2.click();
		
		
		WebElement a4 = driver.findElement(By.xpath("(//input[@value='1'])"));
		a4.click();
		boolean a5 = a4.isSelected();
	    System.out.println(a5);
	    boolean a6 = a4.isSelected();
	    System.out.println(a6);
	    
	}

}
