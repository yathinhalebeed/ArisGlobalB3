import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2Mouseoperation {
	
	public static void main (String args[]) throws InterruptedException {
		

	System.setProperty("webdriver.edge.driver", "C:\\Bin\\msedgedriver.exe");
	WebDriver myd = new EdgeDriver();
	myd.manage().window().maximize();
	myd.get("http://www.youcandealwithit.com/");
	System.out.println("It has navigated to"+myd.getTitle());
	
	Actions act = new Actions(myd);
	act.moveToElement(myd.findElement(By.linkText("BORROWERS"))).build().perform();
	Thread.sleep(5000);
	
	myd.findElement(By.linkText("Calculators & Resources")).click();
	
	System.out.println("It has navigated to"+myd.getTitle());
	
	myd.navigate().to("https://www.amazon.in/");
	
	act.moveToElement(myd.findElement(By.linkText("Hello, Sign in Account & Lists"))).build().perform();
	
	Thread.sleep(5000);
	
	myd.findElement(By.partialLinkText("Sign in")).click();
	
	Thread.sleep(3000);
	
	System.out.println("It has navigated to"+myd.getTitle());
	
	myd.close();
	
	}

}
