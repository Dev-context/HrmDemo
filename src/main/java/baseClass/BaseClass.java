package baseClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    public static WebDriver driver;

    @BeforeMethod
    public void initializer(){
        if(driver==null){
            System.out.println("BaseClass");
            driver=new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        }
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
