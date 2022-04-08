import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/chira/Desktop/Selenium Course/Ex_Files_Learning_Selenium_Java/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        submitform(driver);
        waitforalert(driver);
        assertEquals("The form was successfully submitted!",getalerttext(driver));

        driver.quit();
    }
    public static void submitform(WebDriver driver){
        driver.findElement(By.id("first-name")).sendKeys("Chirag");
        driver.findElement(By.id("last-name")).sendKeys("Chhabra");
        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
        driver.findElement(By.cssSelector("input[value='radio-button-3']")).click();
        driver.findElement(By.xpath("//*[@id=\"checkbox-1\"]")).click();
        driver.findElement(By.id("select-menu")).click();
        driver.findElement(By.cssSelector("option[value='2']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("04/08/2022");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector("a.btn.btn-lg.btn-primary")).click();
    }
    public static void waitforalert(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
    }
    public static String getalerttext(WebDriver driver){
        return driver.findElement(By.className("alert")).getText();
    }
}
