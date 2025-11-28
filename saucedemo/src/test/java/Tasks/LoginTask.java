package Tasks;

import Framework.Utils.FileOperations;
import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTask {

    private WebDriver driver;
    private LoginPage loginPage;

    public LoginTask (WebDriver driver){
        this.driver = driver;
        loginPage = new LoginPage(this.driver);
    }

   /* public void efetuarLogin(){

        loginPage.getUserNameInput().sendKeys("standard_user");
        loginPage.getPasswordInput().sendKeys("secret_sauce");
        loginPage.getLoginButton().click();
    }*/

    public void efetuarLogin(){

        loginPage.getUserNameInput().sendKeys(FileOperations.getProperties("user").getProperty("user"));
        loginPage.getPasswordInput().sendKeys(FileOperations.getProperties("user").getProperty("password"));
        loginPage.getLoginButton().click();
    }


}
