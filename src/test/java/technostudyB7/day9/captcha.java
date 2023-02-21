package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.UtilityClass;

public class captcha extends UtilityClass {
    public static void main(String[] args) {         // in this example becuse we have captch awe have to use wait untile loginis clickable and then we do captch manually then we contine
///** Navigate to https://www.phptravels.net
        driver.get("https://www.phptravels.net");
//     * Click on Account button
        WebElement account=driver.findElement(By.id("ACCOUNT"));
        account.click();
//     * Click on Customer Sign Up
//     * Fill the form
//     * Check the "I am not robot" check box
//     * Click on Sign Up button
//     * Check if the title is "Login - PHPTRAVELS"
//     * Enter same login information that you used during registration and click login
//     * Verify the welcome message contains the first name that you used during registration then close the browser
//     *
//     * Note: You can use any locator you want.
//     * */
    }
}
