import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/chira/Desktop/Selenium Course/Ex_Files_Learning_Selenium_Java/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileupload = driver.findElement(By.id("file-upload-field"));
        fileupload.sendKeys("file-to-upload.png");
        driver.quit();
    }
}
