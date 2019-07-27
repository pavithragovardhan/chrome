package com.abc.loginmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {


	 WebDriver chrome;
     
     @FindBy(linkText="Log Out")
     WebElement logout;
     
		public LogoutPage(WebDriver chrome) {
			super();
			this.chrome = chrome;
			PageFactory.initElements(chrome, this);
		}
		
		public void clickOnLogout() {
			logout.click();
		}
	
	
	
	
	
	
	
	
	
	
	
}
