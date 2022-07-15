package sampleexecution;

import org.testng.annotations.Test;

public class campaignModuleTest {
	
	@Test(groups = "smoke")
	public void creatcampaign() {
        String value = System.getProperty("browser");
		System.out.println(value);
	}
	
	
	@Test(groups = "regression")
	public void DeleteCampaign() {
		String value = System.getProperty("browser");
		System.out.println(value);
		
	}

}
