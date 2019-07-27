package com.abc.loginmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	              WebDriver chrome;
	              
	              @FindBy(id="email")
	              WebElement email;
	
	              
	              @FindBy(id="pass")
	                   WebElement password;
	
	              
	                       @FindBy(id="send2")
	                     WebElement login;


						public LoginPage(WebDriver chrome) {
							super();
							this.chrome = chrome;
							PageFactory.initElements(chrome, this);
						}
	
						public void typeEmail(String emaildata) {
							email.sendKeys(emaildata);
						}
	
						public void typePassword(String passdata) {
							password.sendKeys(passdata);
						}
	
						public void clickOnLogin() {
							login.click();
						}
	
	
	
	
	
	
	
	

	}


