package org.newp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCreation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\eclipse-workspace\\\\Selenum\\\\broser\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> list = driver.findElements(By.tagName("table"));
		WebElement table1 = list.get(0);
		String table = table1.getText();
		System.out.println(table);
		System.out.println(   );
		
		List<WebElement> list1 = table1.findElements(By.tagName("th"));
		for(int i=0;i<list1.size();i++) {
			WebElement table2 = list1.get(i);
			String table3 = table2.getText();
			System.out.println(table3);
		}
		System.out.println(    );
		
		List<WebElement> list2 = table1.findElements(By.tagName("td"));
		for(int i=0;i<list2.size();i++) {
			
			WebElement table4 = list2.get(i);
			String text00 = table4.getText();
			if(text00.equals("Mexico")) {
			}
			System.out.println(text00);
		
			List<WebElement> a = table1.findElements(By.tagName("tr"));
            for(int i1=0;i1<a.size();i1++) {
            	WebElement l = a.get(i);
            	String t1 = l.getText();
            	System.out.println(t1);
            	
            }
            
		
		
		
		
	}


}}