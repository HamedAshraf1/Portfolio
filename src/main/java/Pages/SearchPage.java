package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions actions = new Actions(driver);

    private By SearchedProductLocator = By.xpath("//h2[.='Searched Products']");
    public List<WebElement> SearchedProducts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='features_items']/div[@class=\"col-sm-4\"]")));
    private By addToCartButtonForItem = By.cssSelector("[data-product-id = '13']");


    public String SearchedProductTitle() {
        return driver.findElement(SearchedProductLocator).getText();
    }
    public void HoverOverFirstItemAndClickAddToCart(){
        WebElement element = SearchedProducts.get(0);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(addToCartButtonForItem).click();
    }


}
