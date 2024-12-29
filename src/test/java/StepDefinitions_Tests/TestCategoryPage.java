package StepDefinitions_Tests;

import Pages.CategoyPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static StepDefinitions_Tests.BaseTest_Hooks.driver;

public class TestCategoryPage {

CategoyPage categorypage = new CategoyPage(driver);
SoftAssert softAssert = new SoftAssert();

    @Then("Verify that category page is displayed and confirm text women Dress PRODUCTS")
    public void verify_that_category_page_is_displayed_and_confirm_text_women_dress_products() {
        String ExpectedTitle = driver.getTitle();
        String ActualTitle = categorypage.getTheCategoryPageTitle();
        softAssert.assertTrue(ExpectedTitle.equals(ActualTitle));

        String ExpectedText = "Women - Dress Products";
        String ActualText = categorypage.womenDressProductsTitle();
        softAssert.assertTrue(ExpectedText.equals(ActualText));
    }


    @When("The user clicks on Men category")
    public void the_user_clicks_on_men_category() {
        categorypage.ClickOnMenCategory();
    }

    @When("The user clicks on Tshirts link under Men category")
    public void the_user_clicks_on_tshirts_link_under_men_category() {
    categorypage.ClickOnTshirtCategory();
    }

    @Then("Verify that category page is displayed and confirm text men Tshirts PRODUCTS")
    public void verify_that_category_page_is_displayed_and_confirm_text_men_tshirts_products() {
    String ExpectedTitle = "Men - Tshirts Products";
    String ActualTitle = categorypage.MenTshirtProductsProductsTitle();
    softAssert.assertTrue(ExpectedTitle.equals(ActualTitle));

    }
}



