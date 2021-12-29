package ArisGlobalB3.Mavenproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Demomaven1 {
	
	
		@Test
		public void linkedin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Bin\\chromedriver.exe");
        WebDriver myd =new ChromeDriver();
		myd.manage().window().maximize();
		myd.get("https://www.linkedin.com/login");
		System.out.println("Page has navigated to" + myd.getTitle());
		Thread.sleep(5000);
		myd.close();

	}

}
