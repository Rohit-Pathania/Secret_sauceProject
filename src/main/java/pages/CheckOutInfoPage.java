package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckOutInfoPage {
    WebDriver driver;
    public CheckOutInfoPage(WebDriver driver){
        this.driver=driver;
    }

    By firstNamePath = By.xpath("//input[@id='first-name']");
    By lastNamePath = By.xpath("//input[@id='last-name']");
    By postalCodePath = By.xpath("//input[@id='postal-code']");
    By continuePath = By.xpath("//input[@id='continue']");
    By finishPath = By.xpath("//button[@id='finish']");

    By validationTextPath= By.xpath("//h2[text()='Thank you for your order!']");



    public void setFirstName(){
        WebElement fName=driver.findElement(firstNamePath);
        fName.sendKeys("john");
    }
    public void setLastName(){
        WebElement lName=driver.findElement(lastNamePath);
        lName.sendKeys("doe");
    }
    public void setPostalCode(){
        WebElement pCode=driver.findElement(postalCodePath);
        pCode.sendKeys("123456");
    }
    public void setContinueButton() {
        WebElement con = driver.findElement(continuePath);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", con);
    }
    public void setFinishButton() {
        WebElement fin = driver.findElement(finishPath);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", fin);
    }

    public void orderValidation(){
        WebElement actualText= driver.findElement(validationTextPath);
        String actualMessage=actualText.getText();
        String expectedText="Thank you for your order!";
        Assert.assertEquals(actualMessage,expectedText);

    }


}
