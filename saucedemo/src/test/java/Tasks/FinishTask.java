package Tasks;

import Framework.Browser.Waits;
import PageObjects.FinishPage;
import Validacao.FinishValidacao;
import Validacao.LoginValidacao;
import org.openqa.selenium.WebDriver;

public class FinishTask {

    private WebDriver driver;
    private FinishPage finishPage;
    private Waits waits;
    private FinishValidacao finishValidacao;
    private LoginValidacao loginValidacao;

    public FinishTask(WebDriver driver){
        this.driver =driver;
        waits= new Waits(this.driver);
        finishPage = new FinishPage(this.driver);
        finishValidacao = new FinishValidacao(this.driver);
        loginValidacao = new LoginValidacao(this.driver);

    }

    public void finalizarCompra() throws InterruptedException {

        finishPage.getFinishButton().click();
        Thread.sleep(5000);
        finishValidacao.validationSucessoCompra();
        finishPage.getMenuButton().click();
        waits.loadElement(finishPage.getMenuLogoutLink());
        finishPage.getMenuLogoutLink().click();
        Thread.sleep(5000);
        loginValidacao.loginValidation();

    }
}
