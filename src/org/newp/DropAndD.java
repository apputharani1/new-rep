package org.newp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropAndD {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\eclipse-workspace\\\\Selenum\\\\broser\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement from = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement to = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions ac=new Actions(driver);
		ac.dragAndDrop(from, to).perform();
		WebElement from1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement to1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		//ac.dragAndDrop(from1, to1).perform();
		ac.clickAndHold(from1).release(to1).perform();
		
		
	
	
	}
	
	  

}
