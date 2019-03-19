package jenkins.DemoJenkins;

import org.testng.annotations.Test;

public class TestCases extends Utility{


	@Test(enabled = true, priority = 0)
	public void jenkinsTest() {
		openBrowser("Chrome");
		openUrl("https://travofy.com/");
		
		
	}

}
