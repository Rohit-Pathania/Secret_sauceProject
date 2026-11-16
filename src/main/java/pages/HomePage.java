package pages;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {
        WebDriver driver;

        public HomePage(WebDriver driver) {
            this.driver = driver;
        }

        //locators

        By validationTextpath = By.xpath("//div[text()='Swag Labs']");


        //Actions
        public void getTextValue() {

            WebElement TextValue = driver.findElement(validationTextpath);
            String actualTextValue=TextValue.getText();
            String expectedTextValue="Swag Labs";
            Assert.assertEquals(actualTextValue,expectedTextValue);

        }
    }