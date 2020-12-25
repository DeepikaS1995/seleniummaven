package com.MavenProject.AccountTest;

import org.testng.annotations.Test;

public class AccountTest {

	@Test(groups="smokeTest")
	public void createAccount()
	{
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		System.out.println("browser is :" +browser);
		System.out.println("url:"+ url);
		System.out.println("test case is executed");
	}
	@Test(groups="regressionTest")
	public void modifyAccount()
	{
		System.out.println("succsefully modified");
	}
}
