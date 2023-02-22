package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import technostudyB7.UtilityClass;

public class iframe3 extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

       driver.switchTo().frame(0);
        WebElement topix=driver.findElement(By.tagName("input"));
        topix.sendKeys("hey");

        driver.switchTo().frame(0);
        WebElement checkBox= driver.findElement(By.id("a"));
        checkBox.click();

        driver.switchTo().defaultContent();
        WebElement header= driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        System.out.println(header.getText());

        driver.switchTo().frame(1);

        WebElement animals=driver.findElement(By.tagName("select"));
        Select select=new Select(animals);
        select.selectByIndex(2);

        driver.switchTo().defaultContent();



    }
}
