package com.demo.pages;

import com.demo.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.animation.model.KeyframeStyle;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterPage {

    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@ng-model='FirstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@ng-model='LastName']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//textarea[@rows='3']")
    public WebElement addressBox;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailAdressBox;

    @FindBy(xpath = "//input[@type='tel']")
    public WebElement phoneNumberBox;

    @FindBy(xpath = "//input[@value='Male']")
    public WebElement maleRadioButton;

    @FindBy(xpath = "//input[@value='FeMale']")
    public WebElement femaleRadioButton;

   @FindBy(xpath = "//*[contains(@id, \"checkbox1\")]")
   public WebElement cricketChekcbox;

    @FindBy(xpath = "//*[contains(@id, \"checkbox2\")]")
    public WebElement moviesCheckbox;

    @FindBy(xpath = "//*[contains(@id, \"checkbox3\")]")
    public WebElement hockeyCheckbox;

    @FindBy(xpath = "//*[@id='msdd']")
    public WebElement languagesTab;

    @FindBy(xpath = "//ul[contains(@style, 'list')]/li")
    public List<WebElement> languagesList;

    @FindBy(xpath = "//*[@id='Skills']")
    public WebElement skillsDropdown;

    @FindBy(xpath = "//*[@id='countries']")
    public WebElement countryDropdown;

    @FindBy(xpath = "//span[@tabindex='-1']")
    public WebElement selectCountryTab;

    @FindBy(xpath = "//input[@tabindex='0']")
    public WebElement selectCountryInputBox;

    @FindBy(xpath = "//*[@id='yearbox']")
    public WebElement yearDropdown;

    @FindBy(xpath = "//select[@placeholder='Month']")
    public WebElement monthDropdown;

    @FindBy(xpath = "//*[@id='daybox']")
    public WebElement dayDropdown;

    @FindBy(xpath = "//*[@id='firstpassword']")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id='secondpassword']")
    public WebElement passwordConfirmBox;

    @FindBy(xpath = "//*[@id='submitbtn']")
    public WebElement submitBttn;

    @FindBy(xpath = "//*[@id='Button1']")
    public WebElement refreshBttn;

    @FindBy(xpath = "//*[@id='imagesrc']")
    public WebElement imgUploadBttn;


    public void register(String firstName, String lastName, String fullAddress,
                         String email, String phoneNum, String gender, String hobbies, List<String>languages, String skill,
                         String country, String year, String month, String day, String password
    ) {

        firstNameBox.sendKeys(firstName);
        lastNameBox.sendKeys(lastName);
        addressBox.sendKeys(fullAddress);
        emailAdressBox.sendKeys(email);
        phoneNumberBox.sendKeys(phoneNum);

        if (gender.equalsIgnoreCase("male")) {
            maleRadioButton.click();
        } else {
            femaleRadioButton.click();
        }

        if (hobbies.equals("Movies")){
            moviesCheckbox.click();
        } else if (hobbies.equals("Cricket")) {
            cricketChekcbox.click();
        }else {
            hockeyCheckbox.click();
        }


        languagesTab.click();

        for (WebElement eachLangOp : languagesList) {
            for (String eachLanguage : languages) {
                if (eachLangOp.getText().equals(eachLanguage)) {
                    eachLangOp.click();
            }

            }
        }

        Select selectSkills = new Select(skillsDropdown);
        selectSkills.selectByValue(skill);

        Select selectCountry = new Select(countryDropdown);
        selectCountry.selectByVisibleText("Select Country");


        selectCountryTab.click();
        selectCountryInputBox.sendKeys(country + Keys.ENTER);


        Select selectYear = new Select(yearDropdown);
        Select selectMonth = new Select(monthDropdown);
        Select selectDay = new Select(dayDropdown);

        selectYear.selectByValue(year);
        selectMonth.selectByValue(month);
        selectDay.selectByValue(day);



        passwordBox.sendKeys(password);
        passwordConfirmBox.sendKeys(password);




    }


}



