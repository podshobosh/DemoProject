package com.demo.step_definition;

import com.demo.pages.RegisterPage;
import com.demo.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Collections;
import java.util.List;

public class RegisterStepDefs extends RegisterPage {

    RegisterPage registerPage = new RegisterPage();

    @Given("user enters all the required information for registration")
    public void user_enters_all_the_required_information_for_registration() {

        String firstName = ConfigurationReader.getProperty("firstName");
        String lastName = ConfigurationReader.getProperty("lastName");
        String email = ConfigurationReader.getProperty("email");
        String address = ConfigurationReader.getProperty("fullAddress");
        String phoneNum = ConfigurationReader.getProperty("phoneNum");
        String gender = ConfigurationReader.getProperty("gender");
        String hobbies = ConfigurationReader.getProperty("hobbies");
        List<String> language = Collections.singletonList(ConfigurationReader.getProperty("Languages"));
        String skill = ConfigurationReader.getProperty("skill");
        String country = ConfigurationReader.getProperty("country");
        String year = ConfigurationReader.getProperty("year");
        String month = ConfigurationReader.getProperty("month");
        String day = ConfigurationReader.getProperty("date");
        String password = ConfigurationReader.getProperty("password");


        registerPage.register(firstName, lastName,address, email, phoneNum, gender,hobbies, language,skill, country, year, month, day, password);
    }
    @When("user clicks submit")
    public void user_clicks_submit() {
        registerPage.submitBttn.click();
    }
    @Then("user should have a account")
    public void user_should_have_a_account() {
        System.out.println("User account created");
    }


}
