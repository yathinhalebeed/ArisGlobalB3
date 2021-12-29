import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Bin\\msedgedriver.exe");
		WebDriver myd = new EdgeDriver();
		myd.manage().window().maximize();
		myd.get("https://www.amazon.in/");
		String Title = myd.getTitle();
		System.out.println(Title);
		myd.close();

	}

}
