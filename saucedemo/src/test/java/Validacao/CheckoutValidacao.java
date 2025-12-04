package Validacao;

import Framework.Utils.FileOperations;
import Framework.Utils.TakeScreenshot;
import PageObjects.CheckoutPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CheckoutValidacao {

    private WebDriver driver;
    private CheckoutPage checkoutPage;

    public CheckoutValidacao(WebDriver driver){

        this.driver = driver;
        checkoutPage = new CheckoutPage(this.driver);
    }

    public void validationForm(){
        try{

        Assertions.assertFalse(checkoutPage.getFirstNameInput().getAttribute("value").equalsIgnoreCase(" "));
        TakeScreenshot.attachPageScreenshot(driver,"Checkout");
    }catch (Exception e){
            TakeScreenshot.attachPageScreenshot(driver,"Checkout");
            throw e;

        }
    }

    public void validationCamposForm(){
     try{
        String name = FileOperations.getProperties("form").getProperty("name");
        String lastName = FileOperations.getProperties("form").getProperty("lastname");
        String cep = FileOperations.getProperties("form").getProperty("zip");

        Assertions.assertEquals(name, checkoutPage.getFirstNameInput().getAttribute("value"));
        Assertions.assertEquals(lastName, checkoutPage.getLastNameInput().getAttribute("value"));
        Assertions.assertEquals(cep, checkoutPage.getZipCodeInput().getAttribute("value"));
        TakeScreenshot.attachPageScreenshot(driver,"Checkout");
    }catch (Exception e){
         TakeScreenshot.attachPageScreenshot(driver,"Checkout");
         throw e;
     }

   }
}
