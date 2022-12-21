package org.newp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amozon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\welcome\\\\eclipse-workspace\\\\Selenum\\\\broser\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone13",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Mini (256GB) - Starlight']")).click();
		
		//driver.getWindowHandle();
		//driver.getWindowHandles();		
		
		
		
		
		
		
		
		
		
	}
	

}
