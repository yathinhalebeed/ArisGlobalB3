import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1Element3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Bin\\msedgedriver.exe");
		WebDriver myd = new EdgeDriver();
		myd.manage().window().maximize();
		myd.get("https://www.linkedin.com/login");
		System.out.println("Page has navigated to" + myd.getTitle());
		myd.findElement(By.xpath("//input[@id='username']")).sendKeys("Yathin");
		myd.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
		myd.findElement(By.partialLinkText("Forgot")).click();
		System.out.println("Page has navigated to" + myd.getTitle());
		myd.findElement(By.partialLinkText("Join now")).click();
		System.out.println("Page has navigated to" + myd.getTitle());
		
		myd.navigate().to("https://www.amazon.in/");
		myd.findElement(By.xpath("//div[@id='nav-main']/div[2]/div/div/a[1]")).click();
		Thread.sleep(5000);
		myd.close();
		
		

	}

}
