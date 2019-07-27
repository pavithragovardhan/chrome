package com.abc.loginmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

                    WebDriver chrome;
                    
                    @FindBy(linkText="My Account")
                    WebElement myAccount;
                    
					public Home(WebDriver chrome) {
						
						this.chrome = chrome;
						PageFactory.initElements(chrome, this);
				 
					}
					
					public void clickOnMyAccount() {
						myAccount.click();
					}
                    
   
		
		
		
		
		
		
		
	}


