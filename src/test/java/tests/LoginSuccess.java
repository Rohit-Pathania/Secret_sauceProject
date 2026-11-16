package tests;

import base.BaseClass;
import base.LoginBase;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginSuccess extends BaseClass {
    @Test


    public void loginSuccessTest(){
        LoginBase lg=new LoginBase(driver);
        lg.login();
        HomePage val= new HomePage(driver);
        val.getTextValue();


    }
}
