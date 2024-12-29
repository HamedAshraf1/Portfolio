package StepDefinitions_Tests;

import Pages.BrandPage;
import Pages.ProductsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static StepDefinitions_Tests.BaseTest_Hooks.driver;

public class TestBrandPage {

    BrandPage brandpage = new BrandPage(driver);
    ProductsPage productspage = new ProductsPage(driver);
    SoftAssert softAssert = new SoftAssert();

    @Then("Verify that user is navigated to brand page and brand products are displayed")
    public void Verify_that_user_is_navigated_to_brand_page_and_brand_products_are_displayed() {
        String ExpectedTitle = driver.getTitle();
        String ActualTitle = brandpage.getTheBrandPOLOPageTitle();
        softAssert.assertTrue(ExpectedTitle.equals(ActualTitle));

        String ExpectedText = "Brand - Polo Products";
        String ActualText = brandpage.BrandsPoloProductsTitle();
        softAssert.assertTrue(ExpectedText.equals(ActualText));
    }

    @When("The user clicks on other brand link such as HM")
    public void the_user_clicks_on_other_brand_name() {
    brandpage.ClickOnHMBrand();
    }

    @Then("Verify that user is navigated to brand page HM and brand products are displayed")
    public void Verify_that_user_is_navigated_to_brand_HM_page_and_brand_products_are_displayed() {
        String ExpectedTitle = driver.getTitle();
        String ActualTitle = brandpage.getTheBrandHMPagePageTitle();
        softAssert.assertTrue(ExpectedTitle.equals(ActualTitle));

       String ExpectedText = "Brand - H&M Products";
       String ActualText = brandpage.BrandsHMProductsTitle();
       softAssert.assertTrue(ExpectedText.equals(ActualText));
    }
}
