package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class ProductsPage extends BasePage{
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Actions actions = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;


    public List<WebElement> productsList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='features_items']//div[@class='col-sm-4']")));
    private By firstViewProductButton = By.xpath ("//a[.='View Product'][1]");
    private By productName = By.xpath("//h2[.='Blue Top']");
    private By productCategory = By.xpath("//p[.='Category: Women > Tops']");
    private By productPrice = By.xpath("//span[.='Rs. 500']");
    private By productAvailability = By.xpath("//p[contains(text(),' In Stock')]");
    private By productCondition = By.xpath( "//p[contains(text(),' New')]");
    private By productBrand = By.xpath("//p[contains(text(),' Polo')]");
    private By SearchProductBox = By.id("search_product");

    private List<WebElement> addToCartButtonForItem1 = (driver.findElements(By.xpath("//div[@class='overlay-content']//a[contains(@class,'add-to-cart')]")));


    private By ContinueShoppingButton = By.xpath("//button[.='Continue Shopping']");


    private List<WebElement> ViewCartButtons = driver.findElements(By.xpath("//u[.='View Cart']"));

    private By brandsText = By.xpath("//h2[.='Brands']");
    private By ClickBrandName = By.xpath("//a[@href='/brand_products/Polo']");

    public String  getTheProductsPageTitle(){
        return  driver.getTitle();
    }

    public void ClickOnfirstViewProductButton(){

        driver.findElement(firstViewProductButton).click();
    }

    public String  getTheProductDetailsPageTitle(){
        return  driver.getTitle();
    }

    public String ProductDetailsIsVisible(){
        return driver.findElement(productName).getText() +
                driver.findElement(productCategory).getText() +
                driver.findElement(productPrice).getText() +
                driver.findElement(productAvailability).getText() +
                driver.findElement(productCondition).getText() +
                driver.findElement(productBrand).getText();
    }


    public void EnterProductNameInSearchInputAndClickSearchButton() {

        driver.findElement(SearchProductBox).sendKeys("kids" + Keys.TAB + Keys.ENTER);
    }


    public void ClickOnContinueShoppingButton(){

        driver.findElement(ContinueShoppingButton).click();
    }


    public void HoverOverFirstItemAndClickAddToCart(){

        WebElement element = productsList.get(0);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        actions.moveToElement(productsList.get(0)).perform();
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButtonForItem1.get(0)));
        addToCartButtonForItem1.get(0).click();

    }

    public void HoverOverSecondItemAndClickAddToCart() throws InterruptedException {
        actions.moveToElement(productsList.get(1)).perform();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButtonForItem1.get(1)));
        addToCartButtonForItem1.get(1).click();

        Thread.sleep(2000);
    }

    public void ClickViewCartButton(){
        wait.until(ExpectedConditions.elementToBeClickable(ViewCartButtons.get(0)));
        ViewCartButtons.get(0).click();
    }


    public String BrandText(){
        js.executeScript("window.scrollBy(0, 400);");
        return  driver.findElement(brandsText).getText();
    }

    public void ClickOnPoloBrandName() throws InterruptedException {
       driver.findElement(ClickBrandName).click();
    }

}
