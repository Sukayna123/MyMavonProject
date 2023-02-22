package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.UtilityClass;

public class iframe2 extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement topic=driver.findElement(By.tagName("input"));
        topic.sendKeys("sam");
        driver.switchTo().frame(0);
        WebElement checkBox= driver.findElement(By.id("a"));
        checkBox.click();

        driver.switchTo().defaultContent();
        WebElement header=driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        System.out.println(header.getText());

    }
}
