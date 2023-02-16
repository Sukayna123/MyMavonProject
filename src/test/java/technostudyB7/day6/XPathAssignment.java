package technostudyB7.day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class XPathAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //1- Go to https://www.saucedemo.com/
        driver.get("https://www.saucedemo.com/");
        //<input class="input_error form_input" placeholder="Username"
        // type="text" data-test="username" id="user-name" name="user-name" autocorrect="off" autocapitalize="none" value="">\

        //2- login with valid credentials
        WebElement element=driver.findElement(By.xpath("//input[@id='user-name']"));
        element.sendKeys("standard_user");
        //<input class="input_error form_input" placeholder="Password"
        // type="password" data-test="password" id="password" name="password" autocorrect="off" autocapitalize="none" value="">
        Thread.sleep(1000);
        WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys("secret_sauce");
        Thread.sleep(1000);
        //<input type="submit" class="submit-button btn_action" data-test="login-button" id="login-button" name="login-button" value="Login">
        WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();

        //3- Click on Sauce Labs Backpack and add to the cart
        WebElement backBack1=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack'] "));
        String product=backBack1.getText();
      backBack1.click();

       WebElement AddToCart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack'] "));
        AddToCart.click();
      Thread.sleep(3000);
        //4- Click on Back To Products
     WebElement back=driver.findElement(By.xpath("//div[@class='left_component']"));
        back.click();
        //5- Click on Sauce Labs Bolt T-Shirt and add to the cart
        WebElement backBack2=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        String product2=backBack2.getText();
        backBack2.click();
        //button[@id='add-to-cart-sauce-labs-bolt-t-shirt']

        WebElement backBack2add=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        backBack2add.click();

        //6- Click on the cart
        WebElement cart=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
      cart.click();

        //7- Click on the CheckOut button
        WebElement checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();
Thread.sleep(2000);

        //8- Fill the form and click on Continue
        WebElement firstName=driver.findElement(By.id("first-name"));
        firstName.sendKeys("sam");

        WebElement lastName=driver.findElement(By.id("last-name"));
        lastName.sendKeys("smith");

        WebElement zipCode=driver.findElement(By.id("postal-code"));
        zipCode.sendKeys("44444");

        WebElement continuee=driver.findElement(By.id("continue"));
       continuee.click();

        //9- Check if you see your products
        WebElement checkOutProduct1=driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));

        WebElement checkOutProduct2=driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[2]"));

        List<String> checkOutList=new ArrayList<>();
        checkOutList.add(checkOutProduct1.getText());
        checkOutList.add(checkOutProduct2.getText());
        System.out.println(checkOutList.contains(product));
        System.out.println(checkOutList.contains(product2));
    }
}
