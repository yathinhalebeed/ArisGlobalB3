package Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Googlesearchpage {
	
	public WebDriver myd;

	public Googlesearchpage(WebDriver myd) {
		super();
		this.myd = myd;
	}
	
	By searchpage = By.id("result-stats");
	
	public WebElement results() {
		
		return myd.findElement(searchpage);
	}

}
