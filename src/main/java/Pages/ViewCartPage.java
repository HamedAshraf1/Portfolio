package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

import java.time.Duration;

public class ViewCartPage extends BasePage{

    public ViewCartPage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public List<WebElement> addedCardProducts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//tbody/tr")));
    public List<WebElement> cardPrices = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//tbody/tr/td[@class='cart_price']")));
    public List<WebElement> cartQuantities = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//tbody/tr/td[@class='cart_quantity']")));
    public List<WebElement> cartTotalPrices = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//tbody/tr/td[@class='cart_total']")));

    private By proceedToCheckoutButton = By.xpath("//a[.='Proceed To Checkout']");
    private By registerLoginButton = By.xpath("//u[.='Register / Login']");
    private List<WebElement> deleteButtons = driver.findElements(By.xpath("//td[@class='cart_delete']/a"));
    public By cartEmptyText = By.xpath("//b[.='Cart is empty!']");


    public String  getTheCartPageTitle(){
        return  driver.getTitle();
    }


    public void ClickOnCheckOutButton(){
        driver.findElement(proceedToCheckoutButton).click();
    }

    public void ClickOnRegisterLoginButton(){
        driver.findElement(registerLoginButton).click();
    }

    public void ClickOnDeleteButton(){
        deleteButtons.get(0).click();
    }

    public String  CartEmptyTitle(){
        return  driver.findElement(cartEmptyText).getText();
    }

}
