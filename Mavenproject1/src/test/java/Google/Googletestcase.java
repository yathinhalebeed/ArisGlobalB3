package Google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Googletestcase {
	
	@Test
	public void TS001() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Bin\\chromedriver.exe");
        WebDriver myd =new ChromeDriver();
		myd.manage().window().maximize();
		myd.get("https://www.google.com/");
		myd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Googlehomepage Gh = new Googlehomepage(myd);
		Gh.searchtextbox().sendKeys("Arisglobal USA");
		Gh.searchbutton().click();
		Thread.sleep(5000);
		Googlesearchpage Gs = new Googlesearchpage(myd);
		System.out.println(Gs.results().getText());
		myd.close();
	}

}
