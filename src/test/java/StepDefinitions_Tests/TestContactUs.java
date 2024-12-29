package StepDefinitions_Tests;

import Pages.ContactUsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static StepDefinitions_Tests.BaseTest_Hooks.driver;

public class TestContactUs {

    ContactUsPage contactuspage = new ContactUsPage(driver);
    SoftAssert softAssert = new SoftAssert();


    @When("Click on ContactUs Button")
    public void Click_Contact_Us_Button() throws InterruptedException {
        Thread.sleep(2000);
        contactuspage.ClickContactUsButton();
    }

    @Then("Verify GET IN TOUCH is visible")
    public void Verify_GET_IN_TOUCH_is_visible(){
        String ExpectedResult = "GET IN TOUCH";
        String ActualResult = contactuspage.GetTitleGetInTouch();
        softAssert.assertTrue(ExpectedResult.equals(ActualResult));
    }


    @When("The user enters name, email, subject and message")
    public void the_user_enters_name_email_subject_and_message() {
        contactuspage.FillDataInContactUsForm();
    }

        @When("The user uploads file")
        public void the_user_uploads_file() {
        contactuspage.UploadElement();
        }

    @When("The User clicks Submit button")
    public void the_user_clicks_submit_button() throws InterruptedException {
        contactuspage.ClickSubmitButton();
        Thread.sleep(3000);
    }

        @When("The user clicks OK button")
        public void the_user_clicks_ok_button() throws InterruptedException {
            driver.switchTo().alert().accept();
            Thread.sleep(3000);
        }

        @Then("Verify success message Your details have been submitted successfully is visible")
    public void Verify_success_message_Your_details_have_been_submitted_successfully_is_visible(){

            String ExpectedResult = "Success! Your details have been submitted successfully";
            String ActualResult = contactuspage.SuccessMessageTitle();
            softAssert.assertTrue(ExpectedResult.equals(ActualResult));
        }

        @When("Click on Home Button")
    public void Click_On_Home_Button(){
        contactuspage.ClickHomeButton();
        }
    }

