package com.mail.api;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class test {
	
	WebDriver driver=null;
	
	@Test
	public void test(){
		browserDriver b=browserDriver.instance();
		driver=b.driver;
		driver.get("http://www.baidu.com");
		
	}
	
}
