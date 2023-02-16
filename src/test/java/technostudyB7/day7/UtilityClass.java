package technostudyB7.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UtilityClass {
   public static WebDriver driver;

    static{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    }
