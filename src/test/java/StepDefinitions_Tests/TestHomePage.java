package StepDefinitions_Tests;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static StepDefinitions_Tests.BaseTest_Hooks.driver;

public class TestHomePage {

    HomePage homePage = new HomePage(driver);
    SoftAssert softAssert = new SoftAssert();
    String Actual_Title;

    @Given("^Navigate to url$")
    public void navigateToUrl() {
    }
    @When("Get the page title")
    public void getThePageTitle() {
        Actual_Title = homePage.getThePageTitle();
        System.out.println(Actual_Title);
    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        String expected_title = "Automation Exercise";
        softAssert.assertEquals(expected_title, Actual_Title);
        softAssert.assertAll();
    }


    @When("Click on test case button")
    public void Click_on_TestCase_Button(){
        homePage.ClickOnTestCaseButton();
    }

    @Then("Verify user is navigated to test cases page successfully")
    public void verifyThatNavigatedToTestCasesPage() {
        String ExpectedResult = driver.getTitle();
        String ActualResult = homePage.getThePageTestCaseTitle();
        softAssert.assertEquals(ExpectedResult, ActualResult);
        softAssert.assertAll();
    }

    @When("Click on product button")
    public void Click_on_Product_Button(){
        homePage.ClickOnProductButton();
    }


    @When("The user scrolls down to footer")
    public void the_user_scrolls_down_to_footer() {
        homePage.scrollIntoView();

    }

    @Then("Verify text SUBSCRIPTION")
    public void verify_text_subscription() {
        String ExpectedResult = "Subscription";
        String ActualResult = homePage.SUBSCRIPTIONTitle();
        softAssert.assertTrue(ExpectedResult.equals(ActualResult));

    }

    @When("The user enters email address in input and click arrow button")
    public void the_user_enters_email_address_in_input_and_click_arrow_button() throws InterruptedException {
        homePage.EnterEmailINSubscriptionFieldAndClickArrowButton();
    }

    @Then("Verify success message You have been successfully subscribed! is visible")
    public void verify_success_message_you_have_been_successfully_subscribed_is_visible() {
        String ExpectedResult = "You have been successfully subscribed!";
        String ActualResult = homePage.SuccessMessageWhenEnterEmailAndClickArrowButton();
        softAssert.assertTrue(ExpectedResult.equals(ActualResult));
    }

    @When("The user clicks View Product for any product on home page")
    public void the_user_clicks_view_product_for_any_product_on_home_page() {

     homePage.ClickonViewProducttButton();
        }

    @When("Click on Cart button")
    public void Click_on_Cart_Button(){
        homePage.ClickOnCartButton();
    }

    @Then("Verify that categories are visible on left side bar")
    public void verify_that_categories_are_visible_on_left_side_bar() {

    String ExpectedTitle = "Category";
    String ActualTitle = homePage.VerifyCategoryTitle();
    softAssert.assertTrue(ExpectedTitle.equals(ActualTitle));
    }

    @When("The user clicks on Women category")
    public void the_user_clicks_on_women_category() {
        homePage.ClickWomenCategory();
    }

    @When("The user clicks on Dress link under Women category")
    public void the_user_clicks_on_dress_link_under_women_category() {
        homePage.ClickDressInWomenCategory();
    }

}
