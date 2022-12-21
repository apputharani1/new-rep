package org.newp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertt {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\eclipse-workspace\\\\Selenum\\\\broser\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement se = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		se.click();
        Alert a = driver.switchTo().alert();	
       // String text = a.getText();
        //System.out.println("enter the text------"+text);
        a.accept();
        
        
        WebElement se1 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
        se1.click();
      WebElement ed = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
      ed.click();
      
        Alert a1 = driver.switchTo().alert();
        String text2 = a1.getText();
        System.out.println("enter the text-----"+text2);
        a1.dismiss();
        
        
        WebElement a2 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
        a2.click();
        WebElement ed1 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
        ed1.click();
        
        Alert a4 = driver.switchTo().alert();
        a4.sendKeys("appu");
       // String text3 = a4.getText();
        //System.out.println("enter the text---------"+text3);
       a4.accept();
        
	}

}
