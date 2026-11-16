package tests;

import base.BaseClass;

import base.LoginBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddToCart;
import pages.CheckOutInfoPage;

public class CartingTest extends BaseClass {
    @BeforeClass
    public void loginBeforeTest() {

        LoginBase lp = new LoginBase(driver);

        lp.login();
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

