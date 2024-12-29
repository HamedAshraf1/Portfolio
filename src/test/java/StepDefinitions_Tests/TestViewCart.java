package StepDefinitions_Tests;

import Pages.RegisterPage;
import Pages.ViewCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static StepDefinitions_Tests.BaseTest_Hooks.driver;

public class TestViewCart {

    SoftAssert softAssert = new SoftAssert();
    ViewCartPage viewcartpage = new ViewCartPage(driver);

    @Then("Verify that cart page is displayed")
    public void verify_Cart_page_is_displayed() {
        String ExpectedTitle = driver.getTitle();
        String ActualTitle = viewcartpage.getTheCartPageTitle();
        softAssert.assertEquals(ExpectedTitle,ActualTitle);
    }


    @Then("Verify both products are added to Cart")
    public void verify_both_products_are_added_to_cart() {
        softAssert.assertEquals(2, viewcartpage.addedCardProducts.size());
    }

    @Then("Verify their prices, quantity and total price")
    public void verify_their_prices_quantity_and_total_price() {

        softAssert.assertEquals(viewcartpage.cardPrices.get(0).getText(), "Rs. 500");
        softAssert.assertEquals(viewcartpage.cartQuantities.get(0).getText(), "1");
        softAssert.assertEquals(viewcartpage.cartTotalPrices.get(0).getText(), "Rs. 500");
        softAssert.assertEquals(viewcartpage.cardPrices.get(1).getText(), "Rs. 400");
        softAssert.assertEquals(viewcartpage.cartQuantities.get(1).getText(), "1");
        softAssert.assertEquals(viewcartpage.cartTotalPrices.get(1).getText(), "Rs. 400");
    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verify_that_product_is_displayed_in_cart_page_with_exact_quantity() throws InterruptedException {
        Thread.sleep(2000);
        softAssert.assertEquals(viewcartpage.cartQuantities.get(0).getText(),"4");
    }

    @When("The user clicks Proceed To Checkout button")
    public void the_user_clicks_proceed_to_checkout_button() {
        viewcartpage.ClickOnCheckOutButton();
    }

    @When("The user clicks Register-Login button")
    public void the_user_clicks_register_login_button() {
        viewcartpage.ClickOnRegisterLoginButton();
    }

    @When("The user clicks X button corresponding to particular product")
    public void the_user_clicks_x_button_corresponding_to_particular_product() throws InterruptedException {
        viewcartpage.ClickOnDeleteButton();
    }

    @Then("Verify that product is removed from the cart")
    public void verify_that_product_is_removed_from_the_cart() throws InterruptedException {
        Thread.sleep(3000);

        softAssert.assertEquals(0, viewcartpage.addedCardProducts.size());

    }

    @Then("Verify that products are visible in cart")
    public void verify_products_are_added_to_cart() {
        softAssert.assertEquals(1, viewcartpage.addedCardProducts.size());
    }

}
