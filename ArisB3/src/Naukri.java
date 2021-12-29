import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Naukri {
	
	public static void main (String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.edge.driver", "C:\\Bin\\msedgedriver.exe");
		WebDriver myd = new EdgeDriver();
		myd.manage().window().maximize();
		myd.get("https://www.naukri.com/");
		String parent = myd.getWindowHandle();
		Set<String> I = myd.getWindowHandles();
		
		Iterator<String> I1 = I.iterator();
		
		while(I1.hasNext()){
		
			String childwindow = I1.next();
			
			if(!parent.equals(childwindow))
			{
				myd.switchTo().window(childwindow);
				System.out.println(myd.switchTo().window(childwindow).getTitle());
				Thread.sleep(5000);
				myd.close();
			}
			
		}
		
		myd.switchTo().window(parent);
		myd.close();
		
		

	}
	
}
