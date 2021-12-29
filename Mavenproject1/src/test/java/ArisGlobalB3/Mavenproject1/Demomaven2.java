package ArisGlobalB3.Mavenproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demomaven2 {
	
	
	public WebDriver myd;
	
	@Parameters({"url2"})
	@Test
	
	public void linkdin(String url2) throws InterruptedException {
	
		myd.get(url2);
		System.out.println("Page has navigated to" + myd.getTitle());
		Thread.sleep(5000);

	}
	
	@BeforeTest
	public void browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Bin\\chromedriver.exe");
        myd =new ChromeDriver();
		myd.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void close() {
		myd.close();
	}
	

	

}
