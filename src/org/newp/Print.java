package org.newp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print {
          public static void main(String[] args) {
			
        	  System.setProperty("webelement.chrome.driver", "C:\\\\Users\\\\welcome\\\\eclipse-workspace\\\\Selenum\\\\broser\\\\chromedriver.exe");
      		WebDriver driver=new ChromeDriver();
      		driver.manage().window().maximize();
      		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      		driver.get("http://www.greenstechnologys.com/");
      		driver.findElement(By.xpath("//a[text()='CONTACT US']")).click();
      		WebElement a = driver.findElement(By.xpath("//h5[@style='color:yellow;']"));
        	  String a1 = a.getText();
        	  System.out.println(a1);
		}
}
