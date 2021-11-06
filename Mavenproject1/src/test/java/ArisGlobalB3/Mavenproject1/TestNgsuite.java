package ArisGlobalB3.Mavenproject1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestNgsuite {
	
	@BeforeSuite
	public void runner() {
		
		System.out.println("Opening browser......");
		
	}
	
	@AfterSuite
	public void closer() {
		System.out.println("Closing Browser......");
	}

}
