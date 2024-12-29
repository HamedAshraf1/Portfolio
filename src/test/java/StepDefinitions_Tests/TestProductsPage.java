package StepDefinitions_Tests;

import Pages.ProductsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static StepDefinitions_Tests.BaseTest_Hooks.driver;

public class TestProductsPage {


    ProductsPage productspage = new ProductsPage(driver);
    SoftAssert softAssert = new SoftAssert();



    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() throws InterruptedException {
        String ExpectedResult = "https://www.automationexercise.com/products";
        String ActualResult = productspage.getTheProductsPageTitle();
        softAssert.assertTrue(ExpectedResult.equals(ActualResult));

    }

    @Then("Verify the products list is visible")
    public void verify_the_products_list_is_visible() {
        softAssert.assertTrue(productspage.productsList.size() > 1);
    }

    @When("The user clicks on View Product of first product")
    public void the_user_clicks_on_view_product_of_first_product() {
        productspage.ClickOnfirstViewProductButton();
    }

    @Then("Verify the user is landed to product detail page")
    public void verify_the_user_is_landed_to_product_detail_page() {
        String ExpectedResult = driver.getTitle();
        String ActualResult = productspage.getTheProductDetailsPageTitle();
        softAssert.assertTrue(ExpectedResult.equals(ActualResult));
    }

    @Then("Verify that product detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
      String ExpectedResult = "";
      ExpectedResult+="Blue Top";
      ExpectedResult+="Women > Tops";
      ExpectedResult+="Category: Women > Tops";
      ExpectedResult+="Rs. 500";
      ExpectedResult+="Availability: In Stock";
      ExpectedResult+="Condition: New";
      ExpectedResult+="Brand: Polo";

        String ActualResult = productspage.ProductDetailsIsVisible();
        softAssert.assertTrue(ExpectedResult.equals(ActualResult));
    }

    @When("The user enters product name in search input and click search button")
    public void the_user_enters_product_name_in_search_input_and_click_search_button() {
        productspage.EnterProductNameInSearchInputAndClickSearchButton();
    }


    @When("The user hovers over first product and clicks Add to cart")
    public void the_user_hovers_over_first_product_and_clicks_add_to_cart() {
       productspage.HoverOverFirstItemAndClickAddToCart();
    }

    @When("The user clicks Continue Shopping button")
    public void the_user_clicks_continue_shopping_button() {
    productspage.ClickOnContinueShoppingButton();
    }

    @When("The user hovers over second product and clicks Add to cart")
    public void the_user_hovers_over_second_product_and_clicks_add_to_cart() throws InterruptedException {
       productspage.HoverOverSecondItemAndClickAddToCart();
    }

    @When("The user clicks View Cart button")
    public void the_user_clicks_view_cart_button() {
        productspage.ClickViewCartButton();
    }

    @Then("Verify that Brands are visible on left side bar")
    public void verify_that_brands_are_visible_on_left_side_bar() {
        String ExpectedTitle = "Brands";
        String ActualTitle = productspage.BrandText();
        softAssert.assertTrue(ExpectedTitle.equals(ActualTitle));

    }

    @When("The user clicks on left side bar brand name Polo")
    public void the_user_clicks_on_left_side_bar_brand_name() throws InterruptedException {
      productspage.ClickOnPoloBrandName();
    }

    }
