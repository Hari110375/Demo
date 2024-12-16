package com.inetbanking.hari;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paraller {

	
	
	
	
		
	

	@FindBy(xpath = "//span[@data-bind='text : resourceBundle.topProfile.labels.login']")
	List<WebElement> btn_ProfileLogin;
	@FindBy(xpath = "//oj-input-text[contains(@value,'value')]//input")
	WebElement inp_username;
	@FindBy(xpath = "//oj-input-password[contains(@value,'value')]//input")
	List<WebElement> inp_Password;
	@FindBy(xpath = "//span[@data-bind='text:nls.loginForm.labels.login']")
	List<WebElement> btn_Login;
	@FindBy(xpath = "//div[@class='welcomeUser']")
	List<WebElement> txt_WelcomeUser;
	@FindBy(xpath = "//oj-messages[@id='message-box']//div[@class='oj-message-detail']")
	List<WebElement> error_Message;
	@FindBy(xpath = "//oj-messages[@id='message-box']//span[@slot='startIcon']")
	WebElement icn_Close;
	
	
	
	
	
	
	
}
