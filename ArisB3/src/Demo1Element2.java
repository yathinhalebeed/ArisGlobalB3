import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1Element2 {
	
	public static void main (String args[]) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Bin\\msedgedriver.exe");
		WebDriver myd = new EdgeDriver();
		myd.manage().window().maximize();
		myd.get("https://www.linkedin.com/login");
		System.out.println("Page has navigated to" + myd.getTitle());
		myd.findElement(By.id("username")).sendKeys("Yathin");
		myd.findElement(By.id("password")).sendKeys("12345");
		myd.findElement(By.partialLinkText("Forgot")).click();
		System.out.println("Page has navigated to" + myd.getTitle());
		myd.findElement(By.partialLinkText("Join now")).click();
		System.out.println("Page has navigated to" + myd.getTitle());
		myd.close();
	}

}
