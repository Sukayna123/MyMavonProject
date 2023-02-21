package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.UtilityClass;

import java.util.List;

public class FindElementsExample extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");
        WebElement username=driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton=driver.findElement(By.id("login-button"));
            loginButton.click();

        WebElement backBack1=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack'] "));
        String product1=backBack1.getText();
        backBack1.click();

        WebElement AddToCart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack'] "));
        AddToCart.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement back=driver.findElement(By.xpath("//div[@class='left_component']"));
        back.click();

        WebElement backBack2=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        String product2=backBack2.getText();
        backBack2.click();
        //button[@id='add-to-cart-sauce-labs-bolt-t-shirt']

        WebElement backBack2add=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        backBack2add.click();

        WebElement cart=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cart.click();

        WebElement checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //8- Fill the form and click on Continue
        WebElement firstName=driver.findElement(By.id("first-name"));
        firstName.sendKeys("sam");

        WebElement lastName=driver.findElement(By.id("last-name"));
        lastName.sendKeys("smith");

        WebElement zipCode=driver.findElement(By.id("postal-code"));
        zipCode.sendKeys("44444");

        WebElement continueButton=driver.findElement(By.id("continue"));
        continueButton.click();
        List<WebElement> product=driver.findElements(By.cssSelector("div[class='inventory_item_name']"));
        System.out.println(product.get(0).getText().equals(product1));
        System.out.println(product.get(1).getText().equals(product2));


    }
}
