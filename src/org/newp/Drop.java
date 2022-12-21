package org.newp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\eclipse-workspace\\\\Selenum\\\\broser\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[3]"))).perform();
		a.moveToElement(driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]"))).perform();
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Static ']"))).click().perform();
		
		
		
		
		
		
		
	}

}
