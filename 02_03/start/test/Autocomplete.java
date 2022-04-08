import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/chira/Desktop/Selenium Course/Ex_Files_Learning_Selenium_Java/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));

        autocomplete.sendKeys("Malti Luxuria City");
        Thread.sleep(1000);

        WebElement autocompleteClick = driver.findElement(By.className("pac-item"));
        autocompleteClick.click();
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        driver.quit();
    }
}
