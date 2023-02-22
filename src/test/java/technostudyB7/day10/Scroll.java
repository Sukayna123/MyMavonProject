package technostudyB7.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import technostudyB7.UtilityClass;

public class Scroll extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        WebElement element=driver.findElement(By.xpath("//div[text()='Hire faster']"));
hardWait(3);
        JavascriptExecutor JJ=(JavascriptExecutor) driver;
        JJ.executeScript("arguments[0].scrollIntoView(true);",element);

        System.out.println(element.getText());
    }
}
