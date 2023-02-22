package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.UtilityClass;

public class captcha extends UtilityClass {
    public static void main(String[] args) {
///** Navigate to https://www.phptravels.net
        driver.get("https://www.phptravels.net");
//     * Click on Account button
        WebElement account=driver.findElement(By.id("ACCOUNT"));
        account.click();
//     * Click on Customer Sign Up
        Actions actions=new Actions(driver);

        WebElement customerSignUp=driver.findElement(By.xpath("//a[text()='Customer Signup']"));
        Action HoverOver= actions.moveToElement(customerSignUp).build();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        customerSignUp.click();
//     * Fill the form
        WebElement firstName=driver.findElement(By.name("first_name"));
        firstName.sendKeys("sam");

        WebElement lastName=driver.findElement(By.name("last_name"));
        lastName.sendKeys("smith");

        WebElement phoneNum=driver.findElement(By.name("phone"));
        phoneNum.sendKeys("1115553333");

        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("sam_smith@gmail.com");

        WebElement pass=driver.findElement(By.name("password"));
        pass.sendKeys("123456");
//     * Check the "I am not robot" check box

       WebElement cookies=driver.findElement(By.id("cookie_stop"));
        cookies.click();
 // Click on Sign Up button
      WebElement signUp=driver.findElement(By.id("button"));
        WebDriverWait wait=new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.elementToBeClickable(signUp));
        signUp.click();


//     * Enter same login information that you used during registration and click login
        WebElement emailAgain=driver.findElement(By.name("email"));
        emailAgain.sendKeys("sam_smith@gmail.com");

        WebElement passAgain=driver.findElement(By.name("password"));
       passAgain.sendKeys("123456");

       WebElement login=driver.findElement(By.xpath("//button[@class=\"btn btn-default btn-lg btn-block effect ladda-button waves-effect\"]"));
        login.click();

//     * Check if the title is "Login - PHPTRAVELS"
        String expectedTitle="Login - PHPTRAVELS";
        String actualTitle=driver.getTitle();
//
       System.out.println(actualTitle.equals(expectedTitle));










//     * Verify the welcome message contains the first name that you used during registration then close the browser
//     *
       // WebElement message= driver.findElement(By.cssSelector("//span[@style='text-transform:capitalize']"));
       // System.out.println(message.getText().contains("sam"));




    }
}
