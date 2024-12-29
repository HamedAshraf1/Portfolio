package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    JavascriptExecutor js = (JavascriptExecutor) driver;

    private By SignUPButtonLocator =By.xpath("//*[@class = 'fa fa-lock']");
    private By TestCasesButton = By.xpath("//*[@class = 'test_cases_list']");
    private By ProductButton = By.xpath("//*[@class = 'material-icons card_travel']");
    private By SUBSCRIPTIONTextLocator = By.xpath("//*[@class = 'single-widget']");
    private By susbscribeEmailBox = By.id("susbscribe_email");
    private By successSubscribeText = By.id("success-subscribe");

    private By viewProductButtons = By.xpath("//a[.='View Product']");
    private By CartButton = By.xpath("//*[@class = 'fa fa-shopping-cart']");

    private By CategoryTitle = By.xpath("//h2[.='Category']");
    private By womenCategory = By.xpath("//a[@href='#Women']");
    private By dressCategory = By.xpath("//div[@id='Women']//a[.='Dress ']");



    public String  getThePageTitle(){
        return  driver.getTitle();
    }

    public void ClickonSignUpButton(){
        driver.findElement(SignUPButtonLocator).click();
    }

    public void ClickOnTestCaseButton(){
        driver.findElement(TestCasesButton).click();
    }
    public String  getThePageTestCaseTitle(){
        return  driver.getTitle();
    }

    public void ClickOnProductButton(){
        driver.findElement(ProductButton).click();
    }

    public void scrollIntoView(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.id("footer"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public String SUBSCRIPTIONTitle(){
        return driver.findElement(SUBSCRIPTIONTextLocator).getText();
    }

    public void EnterEmailINSubscriptionFieldAndClickArrowButton() throws InterruptedException {
        Faker fake = new Faker();
        String RandomEmail = fake.internet().emailAddress();
        driver.findElement(susbscribeEmailBox).sendKeys(RandomEmail + Keys.TAB + Keys.ENTER);
        Thread.sleep(3000);
    }

    public String SuccessMessageWhenEnterEmailAndClickArrowButton(){

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(successSubscribeText));
            WebElement element = driver.findElement(successSubscribeText);
            if (element.isDisplayed()) {
                return element.getText();
            } else return "Success message is not displayed.";
        }catch (TimeoutException e){
            return "Success message did not appear within the expected time.";

        }
        }

        public void ClickonViewProducttButton(){

            driver.findElement(viewProductButtons).click();
        }

        public void ClickOnCartButton(){
        driver.findElement(CartButton).click();
        }

        public String VerifyCategoryTitle(){
        return driver.findElement(CategoryTitle).getText();

        }

        public void ClickWomenCategory(){
            js.executeScript("window.scrollBy(0, 400);");
            driver.findElement(womenCategory).click();
        }

    public void ClickDressInWomenCategory(){
        driver.findElement(dressCategory).click();
    }




}
