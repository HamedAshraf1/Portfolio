package StepDefinitions_Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import java.security.PublicKey;

import static StepDefinitions_Tests.BaseTest_Hooks.driver;
public class TestLogin {

  HomePage homePage = new HomePage(driver);
  RegisterPage registerpage = new RegisterPage(driver);
  LoginPage loginpage = new LoginPage(driver);
  SoftAssert softAssert = new SoftAssert();
  TestRegister testRegister = new TestRegister();

@Then("Verify Login to your account is visible")
    public void VerifyLoginToYourAccountIsVisible(){
        String ExpectedValue = "Login to your account";
        String Actual_Result = loginpage.TextLoginToYourAccount();
        softAssert.assertTrue(ExpectedValue.equals(Actual_Result));
        softAssert.assertAll();
    }


    @When("Enter Correct Email and Password And Click Login Button")
    public void EnterDataAndClickLogin(){
    loginpage.EnterDataInLoginFieldsAndClickLogin();
    }


    @When("Enter InCorrect Email and Password And Click Login Button")
    public void EnterIncorrectDataAndClickLogin() throws InterruptedException {
        loginpage.EnterIcorrecDataAndClickLogin();
        Thread.sleep(2000);
    }

    @Then("Verify error Your email or password is incorrect! is visible")
    public void Verify_error_message_email_or_password_is_incorrect_is_visible() throws InterruptedException {
        String ExpectedValue = "Your email or password is incorrect!";
        String Actual_Result = loginpage.EmailAlreadyExistTitle();
        softAssert.assertTrue(ExpectedValue.equals(Actual_Result));
        softAssert.assertAll();
    }


    @When("Click On Logout Button")
    public void ClickOnLogoutButton() throws InterruptedException {
        loginpage.ClickOnLogouButton();
        Thread.sleep(2000);
        }

        @Then("Verify that user is navigated to login page")
    public void Naigate_To_Login_Page(){
           String ExpectedTitle = driver.getTitle();
           String Actual_Title = loginpage.getTheLoginPageTitle();
           softAssert.assertTrue(ExpectedTitle.equals(Actual_Title));


        }

    }




