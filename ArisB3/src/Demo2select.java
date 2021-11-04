import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2select {
	
	public static void main (String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.edge.driver", "C:\\Bin\\msedgedriver.exe");
		WebDriver myd = new EdgeDriver();
		myd.manage().window().maximize();
		myd.get("https://www.mortgagecalculator.org/");
		Thread.sleep(5000);
		
		Select select=new Select(myd.findElement(By.name("param[start_month]")));
		select.selectByIndex(4);
		Thread.sleep(5000);
		select.selectByValue("8");
		Thread.sleep(5000);
		myd.close();
	}

}
