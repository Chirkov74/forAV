import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by пк on 17.02.2017.
 */
public class SimpleTest {

    @Test
    public void positive(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://demosys.loginet.ru/Account/Login.aspx");

        WebElement loginsearchField = driver.findElement(By.cssSelector("#MainContent_ctlContent_lgUserLogin_UserName"));
        loginsearchField.clear();
        loginsearchField.sendKeys("tek20122");
        driver.manage(). timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement passwordsearchField = driver.findElement(By.cssSelector("#Password"));
        passwordsearchField.clear();
        passwordsearchField.sendKeys("542256tek20122");
        driver.manage(). timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement searchButton = driver.findElement(By.cssSelector("#LoginButton"));
        searchButton.click();
    }


    @Test
    public  void negative1(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://demosys.loginet.ru/Account/Login.aspx");

        WebElement loginsearchField = driver.findElement(By.cssSelector("#MainContent_ctlContent_lgUserLogin_UserName"));
        loginsearchField.clear();
        loginsearchField.sendKeys("");
        driver.manage(). timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement passwordsearchField = driver.findElement(By.cssSelector("#Password"));
        passwordsearchField.clear();
        passwordsearchField.sendKeys("");
        driver.manage(). timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement searchButton = driver.findElement(By.cssSelector("#LoginButton"));
        searchButton.click();
    }

     @Test
    public void  negative2(){

         WebDriver driver = new FirefoxDriver();
         driver.manage().window().maximize();
         driver.get("http://demosys.loginet.ru/Account/Login.aspx");

         WebElement loginsearchField = driver.findElement(By.cssSelector("#MainContent_ctlContent_lgUserLogin_UserName"));
         loginsearchField.clear();
         loginsearchField.sendKeys("tek20122");
         driver.manage(). timeouts().implicitlyWait(30, TimeUnit.SECONDS);

         WebElement passwordsearchField = driver.findElement(By.cssSelector("#Password"));
         passwordsearchField.clear();
         passwordsearchField.sendKeys("68645468");
         driver.manage(). timeouts().implicitlyWait(30, TimeUnit.SECONDS);

         WebElement searchButton = driver.findElement(By.cssSelector("#LoginButton"));
         searchButton.click();
     }
}

