package technostudyB7.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.UtilityClass;

import java.util.List;
import java.util.Set;

public class WindowSwitch extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");

        List<WebElement> links=driver.findElements(By.cssSelector("a[target='_blank']"));
String maintabid=driver.getWindowHandle();
        for (WebElement link:links  ) {
            if (!link.getAttribute("href").contains("mailto")){
                link.click();
                //System.out.println(driver.getTitle());
            }
        }
       Set<String> idList= driver.getWindowHandles();
        for (String id:idList   ) {
            if (!id.equals(maintabid)){
                driver.switchTo().window(id);
                System.out.println(driver.getTitle());
                driver.close();
            }
            hardWait(4);
        }
driver.switchTo().window(maintabid);
        System.out.println(driver.getTitle());
       // driver.close();
        //driver.quit();
    }
}
