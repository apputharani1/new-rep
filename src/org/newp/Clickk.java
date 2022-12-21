package org.newp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickk {
       
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenum\\broser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://greenstech.in/selenium-course-content.html");
		driver.get("https://www.redbus.in/online-booking/tnstc");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.id("heading20")).click();
       //Thread.sleep(3000);

		

		//driver.findElement(By.xpath(("//div[@aria-expanded='true']"))).click();
	      // Thread.sleep(3000);

		
        //driver.findElement(By.xpath("//div[@id='heading2011']")).click();
      // Thread.sleep(3000);
       // driver.findElement(By.xpath("//div[@id='heading2011']")).click();
    
	//	driver.findElement(By.id("heading201")).click();
	//	driver.findElement(By.xpath("//a[text()='Resume Model-1 ']")).click();
	//	String t = driver.getTitle();
	//	System.out.println(t);
        JavascriptExecutor js=(JavascriptExecutor) driver;
		
		driver.findElement(By.xpath("(//i[@class='icon D121_icon_userlogo icon-userprofile'])")).click();
		driver.findElement(By.xpath("//span[text()='Sign In/Sign Up']")).click();
		WebElement cli = driver.findElement(By.xpath("//div[@class='mobileInputContainer clearfix']"));
	     Thread.sleep(3000);

        	
		//driver.findElement(By.id("mobileNoInp")).sendKeys("8940336420");
		js.executeScript("arguments[0].click()", cli);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
