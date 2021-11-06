package ArisGlobalB3.Mavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demomaven3 {
	
public WebDriver myd;
	
	@Test(groups = "R1")
	@Parameters({"url"})
	
	public void linkdin(String url) {
	
		myd.get("url");
		System.out.println(myd.findElement(By.className("entry-title")).getText());

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
