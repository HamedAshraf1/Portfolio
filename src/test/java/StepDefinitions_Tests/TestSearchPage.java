package StepDefinitions_Tests;

import Pages.ProductsPage;
import Pages.SearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static StepDefinitions_Tests.BaseTest_Hooks.driver;

public class TestSearchPage {


    SearchPage searchpage = new SearchPage(driver);
    SoftAssert softAssert = new SoftAssert();
    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verify_searched_products_is_visible() throws InterruptedException {
        String ExpectedResult = "SEARCHED PRODUCTS";
        String ActualResult = searchpage.SearchedProductTitle();
        softAssert.assertTrue(ExpectedResult.equals(ActualResult));
    }

    @Then("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible() throws InterruptedException {
    softAssert.assertEquals(1, searchpage.SearchedProducts);
        }

        @When("Add Product To Cart")
        public void AddProductToCart(){
        searchpage.HoverOverFirstItemAndClickAddToCart();
    }
    }



