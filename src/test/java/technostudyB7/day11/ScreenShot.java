package technostudyB7.day11;

import jdk.jshell.execution.Util;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenShot extends UtilityClass {
    public static void main(String[] args) throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
      //  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Username']")));
       userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("333333");


        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]")));
        WebElement errorMessage = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]"));


        if (errorMessage.isDisplayed()){
           LocalDateTime LocalDateTime= java.time.LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM_dd_yyyy_hh_mm_ss_SSS");
            String localDateTimeStr= LocalDateTime.toString();
            TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
            File screenShotInTheMemory=takesScreenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenShotInTheMemory,new File("src/test/java/technostudyB7/ScreenShot"+LocalDateTime.format(formatter)+"screenshot.png"));
        }
    }

}
