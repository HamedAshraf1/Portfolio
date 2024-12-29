package StepDefinitions_Tests;

import Pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import java.util.NoSuchElementException;

import static StepDefinitions_Tests.BaseTest_Hooks.driver;
public class TestRegister {
    HomePage homePage = new HomePage(driver);
    RegisterPage registerpage = new RegisterPage(driver);
    SoftAssert softAssert = new SoftAssert();


    @When("Click on Signup button")
    public void clickOnSignupLoginButton() {
        homePage.ClickonSignUpButton();
    }

    @Then("Verify New User Signup! is visible")
    public void verifyNewUserSignupIsVisible() {
        String ExpectedValue = "New User Signup!";
        String Actual_Result = registerpage.GetTextOfTitle();
        softAssert.assertTrue(ExpectedValue.equals(Actual_Result) );
        softAssert.assertAll();
    }


    @When("Enter Name and Email and click signup button")
    public void EnterNameAndEmailAndClickSignUp(){
        registerpage.Enter_Name_And_Email_And_Click_SignUp();
    }
    @Then("Verify ENTER ACCOUNT INFORMATION is visible")
    public void Verify_that_ENTER_ACCOUNT_INFORMATION_is_visible(){
        String ExpectedValue = "ENTER ACCOUNT INFORMATION";
        String Actual_Result = registerpage.EnterAccountInformation();
        softAssert.assertTrue(ExpectedValue.equals(Actual_Result));
        softAssert.assertAll();
    }


    @When("Enter all data in registration page")
    public void FillAllData(){
        registerpage.FillDataOnSignUpPageAndClickCreateAccount();
    }
    @Then("Verify ACCOUNT CREATED! is visible")
    public void Verify_that_Account_Created_Is_Visible(){
        String ExpectedValue = "ACCOUNT CREATED!";
        String Actual_Result = registerpage.GetAccountCreatedTitle();
        softAssert.assertTrue(ExpectedValue.equals(Actual_Result));
        softAssert.assertAll();
    }

    @When("Click on Continue button")
    public void clickOnContinueButton() {
        registerpage.ClickContinueButton();
    }

    @Then("Verify Logged in as username is visible")
    public void Verify_that_Logged_In_As_UserName_Visible(){
        String username = registerpage.getUsername();
        String ExpectedValue = "Logged in as " + username;
        String Actual_Result = registerpage.LoggedInAsTitle();
        softAssert.assertTrue(ExpectedValue.equals(Actual_Result));
        softAssert.assertAll();
    }

    @When("Click on Delete Account button")
    public void clickOnDeleteAccountButton() {
        registerpage.AccountDeleteButton();
    }

    @Then("Verify ACCOUNT DELETED! is visible")
    public void Verify_That_ACCOUNT_DELETED_Is_Visible(){

        String ExpectedValue = "ACCOUNT DELETED!";
        String Actual_Result = registerpage.AccountDeletedTitleIsVisible();
        softAssert.assertTrue(ExpectedValue.equals(Actual_Result));
    }

    @Then("click continue button")
    public void ClickContinueButton(){
        registerpage.ClickOnContinueButton();
    }



    @When("Enter Name And Exist Email and click signup button")
    public void EnterNameAndExistEmail() {
        homePage.ClickonSignUpButton();
        registerpage.Enter_Name_And_Exist_Email_And_Click_SignUp();

    }

    @Then("Verify Email Address already exist! is visible")
    public void Verify_That_Email_Address_already_exist(){
        String ExpectedValue = "Email Address already exist!";
        String Actual_Result = registerpage.AccountAlreadyExisitingTitle();
        softAssert.assertTrue(ExpectedValue.equals(Actual_Result));

    }

}
