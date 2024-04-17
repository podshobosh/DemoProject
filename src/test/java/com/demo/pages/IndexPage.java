package com.demo.pages;

import com.demo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

    public IndexPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//*[@id='enterimg']")
    public WebElement enterBttn;

    @FindBy(xpath = "//*[@id='btn1']")
    public WebElement signInBttn;

    @FindBy(xpath = "//*[@id='btn2']")
    public WebElement skipSignInBttn;

    public void enterEmailForSignUp(String email){
        emailInputBox.sendKeys(email);
        enterBttn.click();
    }


}
