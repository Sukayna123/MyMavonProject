package technostudyB7.day10;

import org.openqa.selenium.JavascriptExecutor;
import technostudyB7.UtilityClass;

public class ScrollBy extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://youtube.com/");

        hardWait(4);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");

        js.executeScript("window.scrollBy(0,-1000)");
        hardWait(2);

        driver.quit();
    }
}
