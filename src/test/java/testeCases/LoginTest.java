package testeCases;

import baseClass.BaseClass;
import org.testng.annotations.*;
import pages.LoginPage;

public class LoginTest extends BaseClass {

    LoginPage loginPage;


    @BeforeMethod
    public void setup(){
        initializer();
        this.loginPage=new LoginPage(driver);
    }
    @Test
    public void LoginSuccess(){
        loginPage.fillUserName("Admin");
        loginPage.fillPassword("admin123");
    }
}
