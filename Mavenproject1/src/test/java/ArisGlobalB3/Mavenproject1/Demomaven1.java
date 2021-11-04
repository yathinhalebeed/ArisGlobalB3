package ArisGlobalB3.Mavenproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demomaven1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Bin\\msedgedriver.exe");
		WebDriver myd = new EdgeDriver();
		myd.manage().window().maximize();
		myd.get("https://www.linkedin.com/login");
		System.out.println("Page has navigated to" + myd.getTitle());
		myd.close();

	}

}
