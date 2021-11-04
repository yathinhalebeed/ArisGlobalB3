package ArisGlobalB3.Mavenproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demomaven2 {
	
	
	public WebDriver myd;
	
	@Test
	
	public void linkdin() {
	
		myd.get("https://www.linkedin.com/login");
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
	
	@BeforeSuite
	public void bstatement() {
		System.out.println("Opening Browser");
	}
	
	@AfterSuite
	public void cstatement() {
		System.out.println("Closing Browser");
	}

}
