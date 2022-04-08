import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/chira/Desktop/Selenium Course/Ex_Files_Learning_Selenium_Java/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        String orignalhandle = driver.getWindowHandle();

        for(String handle1: driver.getWindowHandles()){
            Thread.sleep(5000);
            driver.switchTo().window(handle1);
            Thread.sleep(5000);
        }

        driver.switchTo().window(orignalhandle);
        Thread.sleep(5000);

        driver.quit();
    }
}
