package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    private By LoginToYourAccountTitle = By.xpath("//h2[text()='Login to your account']");
    private By EmailTextField = By.xpath("//input[@data-qa='login-email']");
    private By PasswordTextField = By.cssSelector("[data-qa = login-password]");
    private By LoginButton = By.xpath("//button[@data-qa='login-button']");
    private By IncorrectEmailOrPasswordLocator = By.xpath("//*[contains(text(), 'Your email or password is incorrect!')]");
    private By LogoutButton = By.linkText("Logout");



    public String TextLoginToYourAccount(){

        return LoginToYourAccountTitle.findElement(driver).getText();
    }


    public void EnterDataInLoginFieldsAndClickLogin(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmailTextField));
        driver.findElement(EmailTextField).sendKeys("hamedashraf0011@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordTextField));
        driver.findElement(PasswordTextField).sendKeys("12345678H@");
        driver.findElement(LoginButton).click();

    }


    public void EnterIcorrecDataAndClickLogin(){
        Faker faker = new Faker();
        String RandomEmail = faker.internet().emailAddress();
        String RandomPassword = faker.internet().password();

        wait.until(ExpectedConditions.visibilityOfElementLocated(EmailTextField));
        driver.findElement(EmailTextField).sendKeys(RandomEmail);
        wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordTextField));
        driver.findElement(PasswordTextField).sendKeys(RandomPassword);
        driver.findElement(LoginButton).click();
    }


    public String EmailAlreadyExistTitle(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(IncorrectEmailOrPasswordLocator));
        return driver.findElement(IncorrectEmailOrPasswordLocator).getText();
    }

    public void ClickOnLogouButton(){
        driver.findElement(LogoutButton).click();
    }

    public String  getTheLoginPageTitle(){
        return  driver.getTitle();
    }

}
