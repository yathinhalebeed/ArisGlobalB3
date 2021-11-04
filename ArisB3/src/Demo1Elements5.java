import java.util.Iterator;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1Elements5 {

	public static void main(String[] args) {
	       
	        System.setProperty("webdriver.chrome.driver", "C:\\Bin\\chromedriver.exe");
	        WebDriver my0 = new ChromeDriver();
	        my0.get("https://www.google.com/");
	        my0.manage().window().maximize();
	        
	        int vsize = my0.findElements(By.tagName("a")).size();
	        System.out.println(vsize);
	        
	        for (int i=0;i<vsize;i++) {
	        	
	        	String vlink = my0.findElements(By.tagName("a")).get(i).getAttribute("href");
	        	System.out.println(vlink);
	        	String vlink2 = my0.findElements(By.tagName("a")).get(i).getText();
				System.out.println(vlink2);
			}

	}

}
