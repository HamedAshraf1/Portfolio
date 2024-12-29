package StepDefinitions_Tests;

import Pages.ProductDetailsPage;
import Pages.ViewCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static StepDefinitions_Tests.BaseTest_Hooks.driver;

public class TestProductDetailsPage {

    ProductDetailsPage productdetails = new ProductDetailsPage(driver);
    SoftAssert softAssert = new SoftAssert();

    @Then("Verify product detail is opened")
    public void verify_product_detail_is_opened() {
        String ExpectedTitle = driver.getTitle();
        String ActualTitle = productdetails.getTheProductDetailsPageTitle();
        softAssert.assertEquals(ExpectedTitle,ActualTitle);
    }

    @When("The user increases quantity to 4")
    public void the_user_increases_quantity_to(){
        productdetails.IncreaseQuantityBox();
    }

    @When("The user clicks Add to cart button")
    public void the_user_clicks_add_to_cart_button() {
        productdetails.ClickAddToCart();
    }

    @When("click View Cart button")
    public void the_user_clicks_view_cart_button() {
        productdetails.ClickViewCartButton();
    }

}
