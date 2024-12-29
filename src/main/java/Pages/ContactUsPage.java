package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactUsPage extends BasePage {
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    private By ContactUsButton = By.xpath("//*[@class = 'fa fa-envelope']");
    private By GetInTechTitleLocator = By.xpath("//h2[.='Get In Touch']");
    private By NameField = By.cssSelector("[data-qa = name]");
    private By emailField = By.cssSelector("[data-qa = email]");
    private By SubjectField = By.cssSelector("[data-qa = subject]");
    private By MessageField = By.cssSelector("[data-qa = message]");
    private By UploadFileButton = By.xpath("//input[@name='upload_file']");
    private By SubmitButton = By.cssSelector("[data-qa = submit-button]");
    private By SuccessMessageLocator = By.xpath("//*[@class = 'status alert alert-success']");
    private By HomeButton = By.xpath("//*[@class = 'fa fa-angle-double-left']");


    public void ClickContactUsButton() {
        driver.findElement(ContactUsButton).click();
    }

    public String GetTitleGetInTouch() {

        return driver.findElement(GetInTechTitleLocator).getText();
    }

    public void FillDataInContactUsForm() {

        Faker faker = new Faker();
        String RandomName = faker.name().fullName();
        String RandomEmail = faker.internet().emailAddress();

        driver.findElement(NameField).sendKeys(RandomName);
        driver.findElement(emailField).sendKeys(RandomEmail);
        driver.findElement(SubjectField).sendKeys("SoftWare Tester");
        driver.findElement(MessageField).sendKeys("AutomationExercise Web site is very Important for any junior automation Tester");

    }

    public void UploadElement(){
        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/test.txt";
        String fullPath = projectPath + "/" + filePath;
        driver.findElement(UploadFileButton).sendKeys(fullPath);
    }

    public void ClickSubmitButton(){
        js.executeScript("window.scrollBy(0,100)");
        driver.findElement(SubmitButton).click();
    }


    public String SuccessMessageTitle(){
        return driver.findElement(SuccessMessageLocator).getText();
    }

    public void ClickHomeButton(){

        driver.findElement(HomeButton).click();
    }
    }







