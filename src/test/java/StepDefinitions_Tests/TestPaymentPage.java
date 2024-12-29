package StepDefinitions_Tests;

import Pages.PaymentPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static StepDefinitions_Tests.BaseTest_Hooks.driver;

public class TestPaymentPage {

    PaymentPage paymentpage = new PaymentPage(driver);
    SoftAssert softAssert = new SoftAssert();

    @When("The user enters payment details: Name on Card, Card Number, CVC, Expiration date")
    public void the_user_enters_payment_details_name_on_card_card_number_cvc_expiration_date() {
        paymentpage.fillCardDetails();
    }

    @When("The user clicks Pay and Confirm Order button")
    public void the_user_clicks_pay_and_confirm_order_button() {
        paymentpage.ClickPayOrderButton();
    }

    @Then("Verify success message Your order has been placed successfully!")
    public void verify_success_message_your_order_has_been_placed_successfully() {
        String ExpectedResult = "Your order has been placed successfully!";
        String ActualResult = paymentpage.VerifySuccessMessage();
        softAssert.assertTrue(ExpectedResult.equals(ActualResult));
    }
}
