package testcases;

import org.testng.annotations.Test;

import base.BaseTest;

public class SampleAppiumTestcase extends BaseTest{
	
	@Test
	public void sampleTestcaseRun() {
		System.out.println(driver.getClass().descriptorString());
		loginPage.testLoginpage();
		loginPage.setUserName("Sambit");
		loginPage.setPassword("SecurePassword");
		loginPage.clickLogin();
	}
	
	//@Test
//	public void sampleTestcaseRun2() {
//		System.out.println(driver.getClass().descriptorString());
//		loginPage.testLoginpage();
	//}
}
