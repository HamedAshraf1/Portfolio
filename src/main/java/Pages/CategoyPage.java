package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoyPage extends BasePage{


    public CategoyPage(WebDriver driver) {
        super(driver);
    }

    private By womenDressProductsText = By.xpath("//h2[.='Women - Dress Products']");
    private By menCategory = By.xpath("//a[@href='#Men']");
    private By tshirtsCategory = By.xpath("//a[.='Tshirts ']");
    private By menTshirtsProductsText = By.xpath("//h2[.='Men - Tshirts Products']");

    public String  getTheCategoryPageTitle(){
        return  driver.getTitle();
    }

    public String womenDressProductsTitle(){
        return driver.findElement(womenDressProductsText).getText();
    }

    public void ClickOnMenCategory(){
        driver.findElement(menCategory).click();
    }
    public void ClickOnTshirtCategory(){
        driver.findElement(tshirtsCategory).click();
    }

    public String MenTshirtProductsProductsTitle(){
        return driver.findElement(menTshirtsProductsText).getText();
    }

}
