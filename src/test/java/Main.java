import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.cesar.school");
        driver.manage().window().maximize();
        System.out.println("What is the URL? " + driver.getCurrentUrl());
        driver.quit();
    }
}
