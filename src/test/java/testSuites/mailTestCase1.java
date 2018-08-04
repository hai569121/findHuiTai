package testSuites;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.mail.api.driverAction;
import com.mail.api.getExcelData;

public class mailTestCase1 {
	
	driverAction action=null;
	getExcelData data=getExcelData.ecxelData;
	
	@Test
	public void testCaseMail(){
		//µÇÂ¼
		action=driverAction.Instance();
		action.goToUrl(data.getCell("loginPage", "loginPage", "url"));
		action.waitElement(10, data.getCell("loginPage", "loginiframe", "Xpath"));
		action.switchTo("x-URS-iframe");
		action.waitElement(10, data.getCell("loginPage", "account", "Xpath"));
		WebElement account=action.getElement(data.getCell("loginPage", "account", "Xpath"));
		WebElement password=action.getElement(data.getCell("loginPage", "password", "Xpath"));
		WebElement loginButton=action.getElement(data.getCell("loginPage", "loginButton", "Xpath"));
		action.clearText(account);
		action.writeText(account, data.getCell("loginPage", "account", "userData"));
		action.writeText(password, data.getCell("loginPage", "password", "userData"));
		action.clickElement(loginButton);		
		//µ÷ÊÔ
		try {
			OutputStream out=new FileOutputStream("D:\\ttt.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
