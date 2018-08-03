package com.mail.api;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class driverAction {
	
	private WebDriver driver=null;
	private static driverAction action=new driverAction(browserDriver.instance().driver);
	private WebDriverWait wait=null;
	
	private driverAction(WebDriver driver) {
		this.driver=driver;
	}
	
	public static driverAction Instance(){
		return action;
	}
	
	//打开url
	public void goToUrl(String url){
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	//切换至iframe
	public void switchTo(String iframeName){
		driver.switchTo().frame(iframeName);
	}
	
	//获取页面元素
	public WebElement getElement(String eleXPath){
		
		return driver.findElement(By.xpath(eleXPath));
	}
	
	//填写文本
	public void writeText(WebElement element,String text){
		element.sendKeys(text);
	}
	
	//点击元素
	public void clickElement(WebElement element){
		element.click();
	}
	
	//等待元素出现
	public void waitElement(int waitTime,String eleXPath){
		wait=new WebDriverWait(driver,waitTime);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(eleXPath)));
	}
	
	//清空文本
	public void clearText(WebElement element){
		element.clear();
	}

}
