package technostudyB7.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClick extends UtilityClass{
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClickButton= driver.findElement(By.id("doubleClickBtn"));
       Actions actions=new Actions(driver);
    Action doubleCluickAction = actions.doubleClick(doubleClickButton).build();
   doubleCluickAction.perform();

        WebElement rightClickButton= driver.findElement(By.id("rightClickBtn"));
       Action rightClickAction=actions.contextClick(rightClickButton).build();
        rightClickAction.perform();

        WebElement clickMe= driver.findElement(By.xpath("//button[text()='Click Me']"));
       Action clickMeAction=actions.click(clickMe).build();
       clickMeAction.perform();
       //action click and regular click both works in this case but sometimes regular click won't work, so we must use Action click
        clickMe.click();

        //2nd way of using Actions
//        Action doubleClickActio2=actions.moveToElement(doubleClickButton).doubleClick().build();
//        doubleClickActio2.perform();
//
//        Action rightClickAction2=actions.moveToElement(rightClickButton).contextClick().build();
//        rightClickAction2.perform();
//
//        Action clickMeAction=actions.moveToElement(clickMe).click().build();
//        clickMeAction.perform();

    }
}
