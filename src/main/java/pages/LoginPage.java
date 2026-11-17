package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    //storing webLocators path//>>

    By userName_path= By.xpath("//input[@id='user-name']");
    By pass_path= By.xpath("//input[@id='password']");
    By submit_path= By.xpath("//input[@id='login-button']");



    //Actions for elements
    public void enterUserName(String username){
        WebElement usernameElement= driver.findElement(userName_path);
        usernameElement.sendKeys(username);
    }

    public void enterPass(String password){
        WebElement passElement= driver.findElement(pass_path);
        passElement.sendKeys(password);
    }

    public void clickLogin(){
        WebElement passElement= driver.findElement(submit_path);
        passElement.click();
    }

}
