package ArisGlobalB3.Mavenproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demomaven2 {
	
	
	public WebDriver myd;
	
	@Test(groups = "R1")
	@Parameters({"url2"})
	
	public void linkdin(String url2) {
	
		myd.get(url2);
		System.out.println("Page has navigated to" + myd.getTitle());

	}
	
	@BeforeTest
	public void browser() {
		System.setProperty("webdriver.edge.driver", "C:\\Bin\\msedgedriver.exe");
		myd = new EdgeDriver();
		myd.manage().window().maximize();
	}
	
	@AfterTest
	public void close() {
		myd.close();
	}
	

	

}
