package baseClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;

    @BeforeMethod
    public void initializer(){
        if(driver==null){
            driver=new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
