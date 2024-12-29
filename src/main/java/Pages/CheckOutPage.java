package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckOutPage extends BasePage{
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    private By deliveryAddressText = By.id("address_delivery");
    private By billingAddressText = By.id("address_invoice");
    private By commentTextBox = By.tagName("textarea");
    public List<WebElement> reviewCardProducts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//tbody//td[@class='cart_product']")));

    public String DeliveryAddress(){
        return driver.findElement(deliveryAddressText).getText();
    }

    public void EnterDescriptionInCommentTextAreaAndClickPlaceOrder() {

        driver.findElement(commentTextBox).sendKeys("myComment" + Keys.TAB + Keys.ENTER);

    }
}