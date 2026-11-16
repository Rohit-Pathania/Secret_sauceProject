package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {
    WebDriver driver;

    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }


    By AddCart_backpackPath = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    By AddToCart_bikeLightPath = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
    By remove_backpackPath = By.xpath("//button[@id='remove-sauce-labs-backpack']");
    By shoppingCart_path=By.xpath("//a[@class='shopping_cart_link']");
    By checkoutButton_path = By.xpath("//button[@name='checkout']");


    public void clickBackpack() {
        WebElement selectBackPack =driver.findElement(AddCart_backpackPath);
        selectBackPack.click();
    }

    public void clickBikeLight(){
        WebElement selectBikeLight= driver.findElement(AddToCart_bikeLightPath);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", selectBikeLight);

    }

    public void setRemove_backpack() {
        WebElement removeBackPack = driver.findElement(remove_backpackPath);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", removeBackPack);
    }
    public void setShoppingCartButton() {
        WebElement shoppingCart = driver.findElement(shoppingCart_path);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", shoppingCart);
    }


    public void setCheckoutButton() {
        WebElement checkOut = driver.findElement(checkoutButton_path);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", checkOut);
    }
}








