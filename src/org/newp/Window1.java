package org.newp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenum\\broser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement a1 = driver.findElement(By.xpath("//input[@type='text']"));
		a1.sendKeys("iphone",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Apple iPhone 12, 64GB, Black - Fully Unlocked (Renewed)']")).click();
		
		//String aa = driver.getWindowHandle();
		//System.out.println(aa);
		
		
	}

}
