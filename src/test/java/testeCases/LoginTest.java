package testeCases;

import baseClass.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pages.LoginPage;

public class LoginTest extends BaseClass {

    LoginPage loginPage;


    @BeforeMethod
    public void setup(){
        this.loginPage=new LoginPage(driver);
    }
    @Test
    public void LoginSuccess() throws InterruptedException {
        loginPage.fillUserName("Admin");
        loginPage.fillPassword("admin123");
        loginPage.clickLogin();

    }
}
