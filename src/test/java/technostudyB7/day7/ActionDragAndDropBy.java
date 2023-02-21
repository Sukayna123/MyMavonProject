package technostudyB7.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.UtilityClass;

public class ActionDragAndDropBy extends UtilityClass {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
//(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[2]
        WebElement rightScroleBar= driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[2]"));
        Actions actions=new Actions(driver);
        Thread.sleep(3000);

        Action scrolAction=actions.dragAndDropBy(rightScroleBar,100,0).build();
        scrolAction.perform();

Thread.sleep(3000);
        Action scrolAction2=actions.dragAndDropBy(rightScroleBar,-150,0).build();
        scrolAction2.perform();

    }
}
