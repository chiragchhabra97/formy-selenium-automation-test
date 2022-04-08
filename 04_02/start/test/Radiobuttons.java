import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/chira/Desktop/Selenium Course/Ex_Files_Learning_Selenium_Java/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radio_button_1 = driver.findElement(By.id("radio-button-1"));
        radio_button_1.click();
        Thread.sleep(1000);
        WebElement radio_button_2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radio_button_2.click();
        Thread.sleep(1000);
        WebElement radio_button_3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radio_button_3.click();
        Thread.sleep(1000);
        driver.quit();
    }
}
