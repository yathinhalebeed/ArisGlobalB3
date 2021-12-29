package Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Googlehomepage {
	
	public WebDriver myd;

	public Googlehomepage(WebDriver myd) {
		super();
		this.myd = myd;
	}
	
	By gtextbox = By.name("q");
	By gsearchbutton = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
	
	public WebElement searchtextbox() {
		return myd.findElement(gtextbox);
		
	}
	
	public WebElement searchbutton() {
		return myd.findElement(gsearchbutton);
		
	}

}
