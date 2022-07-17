package sampleexecution;

import org.testng.annotations.Test;

public class productTest {
	
	@Test(groups = "smoke")
	public void creatprodu() {
        String value = System.getProperty("browser");
		System.out.println(value);
	}

}
