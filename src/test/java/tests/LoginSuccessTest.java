package tests;

import base.BaseClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginSuccessTest extends BaseClass {
    @DataProvider(name="getData",parallel = true)
    public Object[][] getData() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"Admin", "Admin123"},
                {"standard_user", "secret_sauce"}
        };
    }

    @Test (dataProvider ="getData" )
    public void loginSuccessTest(String usern, String pass){
        LoginPage lg=new LoginPage(driver);
        lg.enterUserName(usern);
        lg.enterPass(pass);
        lg.clickLogin();
        HomePage val= new HomePage(driver);
        val.getTextValue();


    }
}

