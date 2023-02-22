package technostudyB7.day10;

import jdk.jshell.execution.Util;
import org.openqa.selenium.JavascriptExecutor;
import technostudyB7.UtilityClass;

public class ScrollTo extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");


        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

        hardWait(4);
        js.executeScript("window.scrollTo(0,0);");

    }
}
