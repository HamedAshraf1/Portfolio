package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage extends BasePage{
    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    private By nameOnCard = By.cssSelector("[name = 'name_on_card']");
    private By CardNumber = By.cssSelector("[name = 'card_number']");
    private By CVC = By.cssSelector("[name = 'cvc']");
    private By ExpirationMonth = By.cssSelector("[name = 'expiry_month']");
    private By ExpirationYear = By.cssSelector("[name = 'expiry_year']");
    private By payAndConfirmOrderButton = By.id("submit");
    private By successMessage = By.xpath("//div[@id='success_message'][1]");


    public void fillCardDetails() {
    driver.findElement(nameOnCard).sendKeys("Fname Lname");
    driver.findElement(CardNumber).sendKeys("123456765432345");
    driver.findElement(CVC).sendKeys("1");
    driver.findElement(ExpirationMonth).sendKeys("1");
    driver.findElement(ExpirationYear).sendKeys("2025");
    }

    public void ClickPayOrderButton(){
        driver.findElement(payAndConfirmOrderButton).click();
    }

    public String VerifySuccessMessage() {

        try {
        wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
        WebElement element = driver.findElement(successMessage);
        if (element.isDisplayed()) {
            return element.getText();
        } else return "Success message is not displayed.";
    }catch (
    TimeoutException e){
        return "Success message did not appear within the expected time.";

    }
    }
    }
