package tests;

import base.BaseClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddToCart;
import pages.CheckOutInfoPage;
import pages.LoginPage;
import utils.ConfigReader;

public class CartingTest extends BaseClass {

    @BeforeClass
    public void loginBeforeTest() {

        LoginPage lg = new LoginPage(driver);

        lg.enterUserName(
                ConfigReader.getProperty("username")
        );

        lg.enterPass(
                ConfigReader.getProperty("password")
        );

        lg.clickLogin();
    }


    @Test
    void validCartItemsTest() {
        AddToCart adc = new AddToCart(driver);
        adc.clickBackpack();
        adc.clickBikeLight();
        adc.setRemove_backpack();
        adc.setShoppingCartButton();
        adc.setCheckoutButton();

        CheckOutInfoPage chkInfo = new CheckOutInfoPage(driver);
        chkInfo.setFirstName();
        chkInfo.setLastName();
        chkInfo.setPostalCode();
        chkInfo.setContinueButton();
        chkInfo.setFinishButton();
        chkInfo.orderValidation();

    }
}



