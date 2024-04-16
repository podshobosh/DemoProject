package com.demo.pages;

import com.demo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='enterbtn']")
    public WebElement enterButton;

    @FindBy(xpath = "//*[@id='errormsg']")
    public WebElement errorMessage;


    public void login(String usernameStr, String passwordStr){
       username.sendKeys(usernameStr);
       password.sendKeys(passwordStr);
       enterButton.click();

    }

}
