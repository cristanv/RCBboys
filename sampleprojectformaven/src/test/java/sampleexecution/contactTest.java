package sampleexecution;

import org.testng.annotations.Test;

public class contactTest {
	
	@Test(groups = "smoke")
	public void createConatct() {
		System.out.println("Create conatct");
	}
	
	@Test(groups = "regression")
	public void DeleteContact() {
		System.out.println("Delete conatct");
	}

}
