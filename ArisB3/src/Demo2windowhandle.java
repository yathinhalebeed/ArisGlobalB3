import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2windowhandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Bin\\msedgedriver.exe");
		WebDriver myd = new EdgeDriver();
		myd.manage().window().maximize();
		myd.get("https://www.gmail.com");
		System.out.println(myd.getTitle());
		myd.findElement(By.linkText("Help")).click();
		Set<String> Gid=myd.getWindowHandles();
		Iterator<String> Git = Gid.iterator();
		String Gparent = Git.next();
		String Gchild = Git.next();
		myd.switchTo().window(Gchild);
		System.out.println(myd.getTitle());		
		myd.close();
				

	}

}
