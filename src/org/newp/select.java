package org.newp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class select {
	public static void main(String[] args) {
		 System.setProperty("webelement.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenum\\broser\\chromedriver.exe");
	   		WebDriver driver=new ChromeDriver();
	   		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		
		
	}

}
