package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BrandPage extends BasePage{


    public BrandPage(WebDriver driver) {
        super(driver);
    }


    private By BrandPoloProducts = By.xpath("//h2[.='Brand - Polo Products']");
    private By ClickBrandName = By.xpath("//a[@href='/brand_products/H&M']");
    private By BrandHandMProducts = By.xpath("//h2[.='Brand - H&M Products']");




    public String  getTheBrandPOLOPageTitle(){
        return  driver.getTitle();
    }

    public String BrandsPoloProductsTitle(){
        return driver.findElement(BrandPoloProducts).getText();
    }

    public void ClickOnHMBrand(){
        driver.findElement(ClickBrandName).click();
    }

    public String  getTheBrandHMPagePageTitle(){
        return  driver.getTitle();
    }

    public String BrandsHMProductsTitle(){
        return driver.findElement(BrandHandMProducts).getText();
    }


}
