package ArisGlobalB3.Mavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demomaven3 {
	
public WebDriver myd;
	
	@Parameters({"url"})
	
	@Test
	public void jquery (String url) throws InterruptedException {
	
		myd.get(url);
		System.out.println(myd.findElement(By.className("entry-title")).getText());
		Thread.sleep(4000);

	}
	
	@BeforeTest
	public void browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Bin\\chromedriver.exe");
        myd =new ChromeDriver();
		myd.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void close() {
		myd.close();
	}
	

}
