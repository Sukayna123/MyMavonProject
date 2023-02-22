package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.UtilityClass;

import java.util.Set;

public class Window extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");
        String mainPage=driver.getWindowHandle();

        WebElement registerNow=driver.findElement(By.xpath("//a[@target='_blank']"));
        registerNow.click();

        Set<String> allIDs=driver.getWindowHandles();
        for (String id:allIDs ) {
            if (!id.equals(mainPage)){
                driver.switchTo().window(id);
            }


        }

      System.out.println( driver.getTitle());
        driver.close();
        driver.switchTo().window(mainPage);
        System.out.println(driver.getTitle());

    }
}
