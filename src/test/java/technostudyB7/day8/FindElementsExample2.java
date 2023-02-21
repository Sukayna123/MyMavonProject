package technostudyB7.day8;

import com.sun.source.tree.WhileLoopTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.UtilityClass;

import java.util.ArrayList;
import java.util.List;

public class FindElementsExample2 extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");
        WebElement username=driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton=driver.findElement(By.id("login-button"));
        loginButton.click();

        List<WebElement>product;
       List<String>productsname=new ArrayList<>();
       List<Integer>indexList=new ArrayList<>();


        while(productsname.size()<3){
            product=driver.findElements(By.cssSelector("div[class='inventory_item_name']"));
            int randomIndex=(int)(Math.random()*product.size());
            if(indexList.contains(randomIndex)){
                continue;
            }
            indexList.add(randomIndex);
            productsname.add(product.get(randomIndex).getText());
            product.get(randomIndex).click();
            WebElement addToCart=driver.findElement(By.xpath("//button[text()='Add to cart']"));
            addToCart.click();
            driver.navigate().back();
        }
        WebElement cartItem=driver.findElement(By.className("shopping_cart_badge"));
        cartItem.click();

        WebElement checkoutButton= driver.findElement(By.id("checkout"));
        checkoutButton.click();
        WebElement firstName=driver.findElement(By.id("first-name"));
        firstName.sendKeys("sam");

        WebElement lastName=driver.findElement(By.id("last-name"));
        lastName.sendKeys("smith");

        WebElement zipCode=driver.findElement(By.id("postal-code"));
        zipCode.sendKeys("44444");

        WebElement continuee=driver.findElement(By.id("continue"));
        continuee.click();


        List<WebElement>checkOutItems=driver.findElements(By.className("inventory_item_name"));
        for (WebElement checkoutProduct : checkOutItems  ) {
            System.out.println(productsname.contains(checkoutProduct.getText()));

        }
        driver.quit();

    }
}
