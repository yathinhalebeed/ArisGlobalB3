import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3Frames {

	public static String vtext;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Bin\\msedgedriver.exe");
		WebDriver myd = new EdgeDriver();
		myd.manage().window().maximize();
		myd.get("https://jqueryui.com/droppable/");
		System.out.println(myd.findElement(By.className("entry-title")).getText());
		
		myd.switchTo().frame(myd.findElement(By.xpath("//iframe[@class='demo-frame']")));
		vtext=myd.findElement(By.id("draggable")).getText();
		
		System.out.println(vtext);
		
		Actions act = new Actions(myd);
		
		WebElement source = myd.findElement(By.id("draggable"));
		WebElement dest = myd.findElement(By.id("droppable"));
		act.dragAndDrop(source,dest).build().perform();
		
		
		Thread.sleep(5000);
		
		
		myd.switchTo().defaultContent();
		System.out.println(myd.findElement(By.className("entry-title")).getText());
			
		myd.close();

	}

}
