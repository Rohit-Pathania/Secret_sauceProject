    package tests;

    import base.BaseClass;
    import org.openqa.selenium.WebDriver;
    import org.testng.annotations.Test;
    import pages.LoginPage;


    public class LoginTest extends BaseClass {

        @Test
        public void validLoginTest(){
            LoginPage lg=new LoginPage( driver);
            lg.enterUserName();
            lg.enterPass();
            lg.clickLogin();
        }

    }
