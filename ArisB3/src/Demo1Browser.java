
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo1Browser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Browser where the test need to performed:");
		String input = sc.nextLine();
		String Browser1 = "Edge";
		String Browser2 = "Mozilla";
		String Browser3 = "Chrome";
		
		
		if (input.equalsIgnoreCase(Browser1)) {
			System.setProperty("webdriver.edge.driver", "C:\\Bin\\msedgedriver.exe");
			WebDriver myd = new EdgeDriver();
			myd.manage().window().maximize();
			myd.get("https:facebook.com");
			String Title = myd.getTitle();
			System.out.println(Title);
			myd.close();
		}else if (input.equalsIgnoreCase(Browser2)) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Bin\\geckodriver.exe");
			WebDriver myd = new FirefoxDriver();
			myd.manage().window().maximize();
			myd.get("https:facebook.com");
			String Title = myd.getTitle();
			System.out.println(Title);
			myd.close();
			
		}else if (input.equalsIgnoreCase(Browser3)) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Bin\\chromedriver.exe");
			WebDriver myd = new ChromeDriver();
			myd.manage().window().maximize();
			myd.get("https:facebook.com");
			String Title = myd.getTitle();
			System.out.println(Title);
			myd.close();
			
		}
		else {
			System.out.println("Invalid input");
		}
		
	}

}
