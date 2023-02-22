package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.UtilityClass;

public class iframe extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");



        driver.switchTo().frame(0);
        WebElement topic=driver.findElement(By.tagName("input"));
        topic.sendKeys("sam");

        driver.switchTo().parentFrame();
       WebElement header=driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        System.out.println(header.getText());






    }
}
