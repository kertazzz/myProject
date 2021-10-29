import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
        search.sendKeys("Selenium", Keys.ENTER);
        WebElement results = driver.findElement(By.id("result-stats"));
        System.out.println(results.getAttribute("innerText"));


    }
}
