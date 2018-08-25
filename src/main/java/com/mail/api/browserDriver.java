package com.mail.api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class browserDriver {

	public WebDriver driver = null;
	private DesiredCapabilities dc = null;
	private String projectPath = System.getProperty("user.dir");
	private static browserDriver browser = new browserDriver();
	private String type = "firefox";

	private browserDriver() {
		if (type.equals("ie")) {
			System.setProperty("webdriver.ie.driver",projectPath + "//src//test//resources//browserDriver//IEDriverServer.exe");
			dc = DesiredCapabilities.internetExplorer();
			dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			driver = new InternetExplorerDriver();
		} else if (type.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "//src//test//resources//browserDriver//geckodriver.exe");
			driver=new FirefoxDriver();
		}
	}

	static public browserDriver instance() {
		return browser;
	}
}
