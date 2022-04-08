import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
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
}
