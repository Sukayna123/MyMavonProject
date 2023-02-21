package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.UtilityClass;

import java.awt.*;

public class ArrowKeysAction extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");
        /**move to element
         * click on the element
         * type b
         * press down arrow key
         * press enter key
         */

        WebElement input= driver.findElement(By.cssSelector("div[class=\"auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3\"]"));
        Actions actions=new Actions(driver);
     Action typeBAction=actions.moveToElement(input).click().sendKeys("b").build();
     typeBAction.perform();
Action arrowKeyAction=actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
        arrowKeyAction.perform();


        quitDriver(4);
    }
}
