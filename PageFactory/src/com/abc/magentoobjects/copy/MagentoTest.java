package com.abc.magentoobjects.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.loginmodule.Home;
import com.abc.loginmodule.LoginPage;
import com.abc.loginmodule.LogoutPage;

public class MagentoTest {

	public static void main(String[] args) {

		                 WebDriver chrome = new ChromeDriver();
		                    chrome.manage().window().maximize();
		                    chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		                    
		                    
		                    chrome.get("http://www.magento.com");
		                       Home home = new Home(chrome);
		                       home.clickOnMyAccount();
		                       
		                       
		                       LoginPage login = new LoginPage(chrome);
		                                  String emaildata="nitinmanjunath1991@gmail.com";
		                                  
										login.typeEmail(emaildata);
		                             String passdata="Welcome123";
									login.typePassword(passdata);
		                          login.clickOnLogin();
		                          
		                          
		                         LogoutPage logout = new LogoutPage(chrome);
		                          logout.clickOnLogout();

		                         
		                          chrome.quit();
		                          
		                          
		                          
		                          
		                          
		
	}

}
