package org.newp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window01 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\Selenum\\broser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/?utm_source=admitad_846&utm_campaign=3b5540caa60faf7641c9721ad1845e44&utm_content=admitad_846&publisher_id=586854");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("keyword")).sendKeys("iphone13",Keys.ENTER);
		driver.findElement(By.xpath("//source[@class='product-image']")).click();
		
		driver.getWindowHandle();
		
		
		
		
		
		
	}

}
