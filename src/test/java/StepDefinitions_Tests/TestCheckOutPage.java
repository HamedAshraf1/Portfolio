package StepDefinitions_Tests;

import Pages.CheckOutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static StepDefinitions_Tests.BaseTest_Hooks.driver;

public class TestCheckOutPage {

    CheckOutPage checkoutpage = new CheckOutPage(driver);
    SoftAssert softAssert = new SoftAssert();

    @Then("Verify Address Details and Review User's Order")
    public void verify_address_details_and_review_user_s_order() {

        String ExpectedResult = "Your delivery address\n" +
                "Mr. mm mm\n" +
                "Semicorner\n" +
                "15 AlQadisia street, Al khusos\n" +
                "cairo\n" +
                "Cairo egypt 13773\n" +
                "India\n" +
                "1118313227\n";
        String ActualResult = checkoutpage.DeliveryAddress();
        softAssert.assertTrue(ExpectedResult.equals(ActualResult));
        softAssert.assertEquals(checkoutpage.reviewCardProducts.size(),2);
    }

    @When("The user enters description in comment text area and click Place Order")
    public void the_user_enters_description_in_comment_text_area_and_click_place_order() {
    checkoutpage.EnterDescriptionInCommentTextAreaAndClickPlaceOrder();
    }
}