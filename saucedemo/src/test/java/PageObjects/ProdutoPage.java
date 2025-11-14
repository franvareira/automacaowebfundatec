package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProdutoPage {

    private WebDriver driver;

    public ProdutoPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getAddToCartButton(){
        return driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
    }

    public WebElement getCartButton(){
        return driver.findElement(By.className("shopping_cart_link"));
    }


}
