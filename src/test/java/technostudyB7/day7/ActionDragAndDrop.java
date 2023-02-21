package technostudyB7.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.UtilityClass;

public class ActionDragAndDrop extends UtilityClass {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        //<div class="dragableBox" id="box3" dragableelement="2">Washington</div>
        WebElement washington=driver.findElement(By.id("box3"));
        //<div id="box103" class="dragableBoxRight">United States</div>
        WebElement unitedState=driver.findElement(By.id("box103"));
        Actions actions=new Actions(driver);
        Action dragAndDropWashington=actions.dragAndDrop(washington,unitedState).build();
        dragAndDropWashington.perform();

        //<div class="dragableBox" id="box6" dragableelement="5">Rome</div>
        WebElement rome =driver.findElement(By.id("box6"));
        //<div id="box106" class="dragableBoxRight">Italy</div>
        WebElement italy= driver.findElement(By.id("box106"));
        Action dragAndDropRome=actions.dragAndDrop(rome,italy).build();
        dragAndDropRome.perform();
//<div class="dragableBox" id="box5" dragableelement="4">Seoul</div>
        WebElement seoul=driver.findElement(By.id("box5"));
        //<div id="box105" class="dragableBoxRight">South Korea</div>
        WebElement soutKorea= driver.findElement(By.id("box105"));
        Action dragAndDropSeoul=actions.dragAndDrop(seoul,soutKorea).build();
        dragAndDropSeoul.perform();

        //<div class="dragableBox" id="box7" dragableelement="6">Madrid</div>
        WebElement madrid= driver.findElement(By.id("box7" ));
        //<div id="box107" class="dragableBoxRight">Spain</div>
        WebElement spain=driver.findElement(By.id("box107"));
        Action dragAndDropMadrid=actions.dragAndDrop(madrid,spain).build();
        dragAndDropMadrid.perform();

        //<div class="dragableBox" id="box1" dragableelement="0">Oslo</div>
        WebElement oslo= driver.findElement(By.id("box1" ));
        //<div id="box101" class="dragableBoxRight">Norway</div>
        WebElement norway= driver.findElement(By.id("box101"));
        Action dragAndDropOslo=actions.dragAndDrop(oslo,norway).build();
        dragAndDropOslo.perform();
//<div class="dragableBox" id="box2" dragableelement="1">Stockholm</div>
        WebElement stockholm= driver.findElement(By.id("box2"));
        //<div id="box102" class="dragableBoxRight">Sweden</div>
        WebElement sweden= driver.findElement(By.id("box102"));
        Action dragAndDropStockholm=actions.dragAndDrop(stockholm,sweden).build();
        dragAndDropStockholm.perform();

        //<div class="dragableBox" id="box4" dragableelement="3">Copenhagen</div>
        WebElement copenhagon= driver.findElement(By.id("box4"));
        //<div id="box104" class="dragableBoxRight">Denmark</div>
        WebElement denmark= driver.findElement(By.id("box104"));

        Action dragAndDropCopenhagon=actions.dragAndDrop(copenhagon,denmark).build();
        dragAndDropCopenhagon.perform();



    }
}
