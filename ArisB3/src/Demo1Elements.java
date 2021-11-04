import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1Elements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Bin\\msedgedriver.exe");
		WebDriver myd = new EdgeDriver();
		myd.manage().window().maximize();
		myd.get("https://www.mortgagecalculator.org/");
		myd.findElement(By.id("homeval")).sendKeys("5000");
		myd.findElement(By.name("param[downpayment]")).sendKeys("500");
		myd.findElement(By.name("param[downpayment_type]")).click();
		myd.findElement(By.name("cal")).click();
		String monthly = myd.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3")).getText();
		System.out.println(monthly);
		myd.close();

	}

}
