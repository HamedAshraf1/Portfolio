package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetailsPage extends BasePage{
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    private By quantityBox = By.id("quantity");
    private By addToCartButton = By.cssSelector(".btn.btn-default.cart");
    private By ViewCartButton = By.xpath("//u[.='View Cart']");


    public String  getTheProductDetailsPageTitle(){
        return  driver.getTitle();
    }

    public void IncreaseQuantityBox(){
        driver.findElement(quantityBox).clear();
        driver.findElement(quantityBox).sendKeys("4");
    }
    public void ClickAddToCart(){
        driver.findElement(addToCartButton).click();
    }

    public void ClickViewCartButton(){
        wait.until(ExpectedConditions.elementToBeClickable(ViewCartButton));
        driver.findElement(ViewCartButton).click();
    }
}
