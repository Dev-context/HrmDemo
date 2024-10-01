package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }


    By userName=By.xpath("//input[@name=\"username\"]");
    By password=By.xpath("//input[@type=\"password\"]");
    By loginButton=By.xpath("//button[@type=\"submit\"]");

    public void fillUserName(String userName){
        driver.findElement(this.userName).sendKeys(userName);
    }

    public void fillPassword(String password){
        driver.findElement(this.password).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(this.loginButton).click();
    }
}
