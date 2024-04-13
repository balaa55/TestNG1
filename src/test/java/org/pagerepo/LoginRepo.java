package org.pagerepo;

import org.baseutils.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginRepo extends BaseClass {
	public LoginRepo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "email")
	private WebElement email;
	@FindBy(id = "pass")
	private WebElement password;
//	@FindBy(xpath = "//*[@class='_8eso']")
	//private WebElement fbtext;
	//public WebElement getFbtext() {
	//	return fbtext;
	
	public WebElement getEmail() {
		return email;
	}


	public WebElement getPassword() {
		return password;
	}
	
		


}
