package technostudyB7.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreNavigations {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com");
        System.out.println("title pf seleniumeasy page" + driver.getTitle());
        String expectedTitle="Selenium Easy - Best Demo website to practice Selenium Webdriver Online";
        String actualresult= driver.getTitle();
        if(expectedTitle.equals(actualresult)){
            System.out.println("verivication is clear- pass");
        }else {
            System.out.println("verification is faild: fail");
            System.out.println(actualresult);
        }
        Thread.sleep(3000);
        String teslaUrl= "https://www.tesla.com/";
        driver.navigate().to(teslaUrl);
        driver.manage().window().maximize();

        driver.close();
        driver.quit();


    }

}
