package org.newp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileee {
	 
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenum\\broser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		File f=new File ("C:\\Users\\welcome\\eclipse-workspace\\Selenum\\liberay\\appu01.png");
		boolean a = f.createNewFile();
		System.out.println(a);
	    
		
  		TakesScreenshot tk=(TakesScreenshot)driver; 
  		WebElement t = driver.findElement(By.xpath("//div[@class='_li']"));
  		File From = t.getScreenshotAs(OutputType.FILE);
		//File to=new File ("C:\\Users\\welcome\\eclipse-workspace\\Selenum\\liberay\\appu.png");

  		System.out.println(From);
		FileUtils.copyFile(From, f);
		System.out.println("done");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
