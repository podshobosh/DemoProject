package com.demo.step_definition;

import com.demo.pages.IndexPage;
import com.demo.utilities.ConfigurationReader;
import com.demo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class IndexPageStepDefs extends IndexPage {

    IndexPage indexPage = new IndexPage();

    @Given("user is on the webpage")
    public void user_is_on_the_webpage() {
    }

    @When("user interacts with the sign-in {string}")
    public void user_interacts_with_the_sign_in(String option) {

        if (option.equalsIgnoreCase(ConfigurationReader.getProperty("option1"))){
            signInBttn.click();

        } else if (option.equalsIgnoreCase(ConfigurationReader.getProperty("option2"))) {
            skipSignInBttn.click();

        } else if (option.equalsIgnoreCase(ConfigurationReader.getProperty("option3"))) {
            emailInputBox.sendKeys(ConfigurationReader.getProperty("email"));
            enterBttn.click();
        }else {
        System.err.println("NO SUCH OPTION");

        }
    }

    @Then("the user should be directed to the {string}")
    public void the_user_should_be_directed_to_the(String expectedDestination) {
        String actualTitle = Driver.getDriver().getTitle();
        if (expectedDestination.equalsIgnoreCase("Sign in Page")) {
            Assert.assertEquals("SignIn", actualTitle);
        } else if (expectedDestination.equalsIgnoreCase("Register Page")) {
            Assert.assertEquals("Register Page", actualTitle);
        } else {
            Assert.fail("Unexpected destination: " + expectedDestination);
        }
    }

    }

}


