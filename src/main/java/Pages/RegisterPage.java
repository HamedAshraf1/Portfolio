package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class RegisterPage extends BasePage{


    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    Faker faker = new Faker();
    String RandomName = faker.name().fullName();
    String RandomEmail = faker.internet().emailAddress();
    String staticEmail = RandomEmail;



    private By SignUpTitleLocator = By.xpath("//h2[text()='New User Signup!']");
    private By NameField = By.cssSelector("[name = name]");
    private By emailField = By.cssSelector("[data-qa = signup-email]");
    private By signupbutton = By.cssSelector("[data-qa = signup-button]");

    private By AccounInformationLocator = By.xpath("//h2[@class='title text-center']");

    private By RadioButtton = By.xpath("//*[@id = 'id_gender1']");
    private By PasswordField = By.xpath("//*[@id = 'password']");
    private By newsletter = By.xpath("//*[@id = 'newsletter']");
    private By option = By.xpath("//*[@id = 'optin']");
    private By Firstname = By.cssSelector("[name=first_name]");
    private By lastname = By.cssSelector("[name = last_name]");
    private By company = By.cssSelector("[name = company]");
    private By address1 = By.cssSelector("[name = address1]");
    private By address2 = By.cssSelector("[name = address2]");
    private By state = By.cssSelector("[name = state]");
    private By city = By.cssSelector("[name = city]");
    private By zipcode = By.cssSelector("[name = zipcode]");
    private By mobile = By.cssSelector("[name = mobile_number]");
    private By CreateAccountButton = By.xpath("//*[@class = 'btn btn-default']");

    private By AccountCreatedLocator = By.xpath("//h2[@class='title text-center']");
    private By ContinueButton = By.xpath("//*[@class = 'btn btn-primary']");

    private By LoggedInLocator = By.xpath("//a[contains(text(),'Logged in')]");
    private By DeleteAccountButton = By.xpath("//*[@class = 'fa fa-trash-o']");


    private By AccountDeletedTitle = By.xpath("//h2[@class='title text-center']");
    private By continueClickButton = By.xpath("//*[@class = 'btn btn-primary']");
    private By EmailAlreadyExistTitle = By.xpath("//p[.='Email Address already exist!']");


    public String GetTextOfTitle(){

        return SignUpTitleLocator.findElement(driver).getText();
    }


    public void Enter_Name_And_Email_And_Click_SignUp() {
        driver.findElement(NameField).sendKeys(RandomName);
        driver.findElement(emailField).sendKeys(RandomEmail);
        driver.findElement(signupbutton).click();
    }

    public String EnterAccountInformation(){

        return AccounInformationLocator.findElement(driver).getText();
    }


    public void FillDataOnSignUpPageAndClickCreateAccount()  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(RadioButtton));
        driver.findElement(RadioButtton).click();

        driver.findElement(PasswordField).sendKeys("12345678H@");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("days")));
        WebElement daysDropdown = driver.findElement(By.id("days"));
        Select selectDays = new Select(daysDropdown);
        selectDays.selectByIndex(2);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("months")));
        WebElement monthsDropdown = driver.findElement(By.id("months"));
        Select selectMonths = new Select(monthsDropdown);
        selectMonths.selectByIndex(1);


        wait.until(ExpectedConditions.elementToBeClickable(By.id("years")));
        WebElement yearsDropdown = driver.findElement(By.id("years"));
        Select selectYears = new Select(yearsDropdown);
        selectYears.selectByIndex(22);


        js.executeScript("window.scrollBy(0, 200);");
        wait.until(ExpectedConditions.visibilityOfElementLocated(newsletter));
        driver.findElement(newsletter).click();

        wait.until(ExpectedConditions.elementToBeClickable(option));
        driver.findElement(option).click();


        driver.findElement(Firstname).sendKeys(RandomName);
        driver.findElement(lastname).sendKeys("Ashraf");
        driver.findElement(company).sendKeys("SemiCorner");
        driver.findElement(address1).sendKeys("15 AlQadisia Street");
        driver.findElement(address2).sendKeys("Cairo");


        wait.until(ExpectedConditions.elementToBeClickable(By.id("country")));
        WebElement CountryDropdown = driver.findElement(By.id("country"));
        Select selectCountry = new Select(CountryDropdown);
        selectCountry.selectByIndex(1);


        driver.findElement(state).sendKeys("Egypt");
        driver.findElement(city).sendKeys("Cairo");
        driver.findElement(zipcode).sendKeys("13773");
        driver.findElement(mobile).sendKeys("01118313227");

        js.executeScript("window.scrollBy(0, 500);");
        wait.until(ExpectedConditions.visibilityOfElementLocated(CreateAccountButton));
        driver.findElement(CreateAccountButton).click();
    }


    public String GetAccountCreatedTitle() {

        return driver.findElement(AccountCreatedLocator).getText();
    }

    public void ClickContinueButton(){
        driver.findElement(ContinueButton).click();
    }

    public String getUsername(){
        return RandomName;
    }

    public String LoggedInAsTitle(){
        return driver.findElement(LoggedInLocator).getText();
    }

    public void AccountDeleteButton(){

        driver.findElement(DeleteAccountButton).click();
    }

    public String AccountDeletedTitleIsVisible(){

        return driver.findElement(AccountDeletedTitle).getText();
    }

    public void ClickOnContinueButton(){

        driver.findElement(continueClickButton).click();
    }


    public void Enter_Name_And_Exist_Email_And_Click_SignUp() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(NameField));
        driver.findElement(NameField).sendKeys(RandomName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        driver.findElement(emailField).sendKeys("hamedashraf111111@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(signupbutton));
        driver.findElement(signupbutton).click();
    }

    public String AccountAlreadyExisitingTitle(){

        return driver.findElement(EmailAlreadyExistTitle).getText();
    }

}
