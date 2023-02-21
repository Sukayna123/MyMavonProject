package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.UtilityClass;

import java.util.List;

public class FindElementsss extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://youtube.com");
       List<WebElement> videoTitles=driver.findElements(By.id("video-title"));
        System.out.println(videoTitles.get(10).getText());
        videoTitles.get(10).click();

    }
}
