package technostudyB7.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.UtilityClass;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Objects;

public class Robot1 extends UtilityClass {
    public static void main(String[] args) throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");

        WebElement file= driver.findElement(By.id("uploadfile_0"));


        Robot robot=new Robot();

        for (int i = 0; i <21 ; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            hardWait(   1);
        }
      robot.keyPress(10);
        robot.keyRelease(KeyEvent.VK_ENTER);


       StringSelection stringSelection=new StringSelection("C:\\Users\\14403\\Desktop\\Interview (3).pdf");
        Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,stringSelection);
        hardWait(1  ) ;
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        hardWait(   1       );
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

hardWait(1);
            WebElement checkbox=driver.findElement(By.id("terms"));
            checkbox.click();
hardWait(1);
        WebDriverWait wait=new WebDriverWait(driver,10);
        WebElement sumbitButton=driver.findElement(By.name("send"));
       sumbitButton.click();
        hardWait(1);

        WebElement successMessage = driver.findElement(By.id("res"));

        System.out.println(successMessage.getText().contains("successfully "));

driver.quit();

    }
}
