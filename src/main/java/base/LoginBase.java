    package base;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.testng.annotations.BeforeClass;

    public class LoginBase{
        WebDriver driver;
        public LoginBase(WebDriver driver){
            this.driver=driver;
        }
        //storing webLocators path//>>

        By userName_path= By.xpath("//input[@id='user-name']");
        By pass_path= By.xpath("//input[@id='password']");
        By submit_path= By.xpath("//input[@id='login-button']");



        //Actions for elements
        @BeforeClass
        public void login(){
            WebElement EnterUsername= driver.findElement(userName_path);
            EnterUsername.sendKeys("standard_user");
            WebElement EnterPassword= driver.findElement(pass_path);
            EnterPassword.sendKeys("secret_sauce");

            WebElement LoginClick= driver.findElement(submit_path);
            LoginClick.click();
        }

    }
