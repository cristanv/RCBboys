package sampleexecution;

import java.lang.annotation.Retention;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class organizatinTest {
	
	@Test(groups = "smoke")
	public void createOrganization() {
		System.out.println("Create organization");
	//	Reporter.log("open browser",true);
	}
	
	@Test(groups = "regression")
	public void DeleteOrganization() {
		System.out.println("Delete Organization ");
	//	Reporter.log("open browser",true);
	}
	

}
