package technostudyB7.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.UtilityClass;

public class GetCssValue extends UtilityClass {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com");
        WebElement searchInput=driver.findElement(By.id("inputValEnter"));
        searchInput.getAttribute("autocomplete");
        System.out.println(searchInput.getAttribute("autocomplete"));
        System.out.println(   searchInput.getAttribute("name"));

searchInput.getAttribute("id");
        System.out.println(searchInput.getAttribute("id"));
        searchInput.getCssValue("background");

        searchInput.getCssValue("font family");
        System.out.println(searchInput.getCssValue("font-family"));

        searchInput.getCssValue(":color");
        System.out.println(searchInput.getCssValue("color"));


    }
}
