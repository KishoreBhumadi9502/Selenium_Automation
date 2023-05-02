package com.cyclos;

import java.io.IOException;

import org.testng.annotations.*;

public class login {

	@Test
	public void Test() throws InterruptedException, IOException {

		
		DriverManager.getDriver("chrome");
		DriverManager.driver.get("https://demo.cyclos.org/ui/home");
		LoginPageObjects lpo = new LoginPageObjects(DriverManager.driver);
		Utils ut=new Utils();
		Thread.sleep(3000);
		lpo.link_Login.click();
		lpo.uname.sendKeys(ut.getcellvalue(1, 0));
		lpo.pword.sendKeys(ut.getcellvalue(1, 1));
		lpo.btn_login.click();

		DriverManager.closeDriver();
	}
}