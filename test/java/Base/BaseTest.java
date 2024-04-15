package Base;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class BaseTest extends LoginPage {

    public static WebDriver driver;
    WebDriverWait wait;
    String baseUrl = "http://10.200.0.27:3001/login/";
    String myUserId = "ABN-02574";
    String myPassword = "Password@1";


    @BeforeTest
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver = new ChromeDriver();
        driver.get(baseUrl);

    }

    @Test
    public void userLogin(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=':r0:']")));
        driver.findElement(By.xpath(staff_id)).sendKeys(myUserId);
//        driver.findElement(By.xpath(password)).sendKeys(myPassword);
//        driver.findElement(By.xpath(submit_btn)).click();

    }
}
