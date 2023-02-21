package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.UtilityClass;

public class HoverOverAction extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.etsy.com/");
        WebElement jewelery=driver.findElement(By.id("catnav-primary-link-10855"));
        Actions actions=new Actions(driver);
        Action hover=actions.moveToElement(jewelery).build();
        hover.perform();
        WebDriverWait wait=new WebDriverWait(driver,10);
//side-nav-category-link-10896
        WebElement earings=driver.findElement(By.id("side-nav-category-link-10896"));
        wait.until(ExpectedConditions.visibilityOf(earings));
        Action hoverEarings=actions.moveToElement(earings).build();
        hoverEarings.perform();

        //id="catnav-l3-10904"
        WebElement clipOnEarings=driver.findElement(By.id("catnav-l3-10904"));
        clipOnEarings.click();
        String currentURL=driver.getCurrentUrl();
        System.out.println(currentURL.contains("clip-on-earrings"));


        driver.quit();

    }
}
