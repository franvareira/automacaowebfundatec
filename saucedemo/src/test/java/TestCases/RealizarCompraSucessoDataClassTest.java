package TestCases;

import Framework.TestBase;
import Tasks.CheckoutTask;
import Tasks.FinishTask;
import Tasks.LoginTask;
import Tasks.ProdutoTask;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.WebDriver;

public class RealizarCompraSucessoDataClassTest extends TestBase {

    private final WebDriver driver = getDriverManager();

    LoginTask loginTask = new LoginTask(driver);
    ProdutoTask produtoTask = new ProdutoTask(driver);
    CheckoutTask checkoutTask = new CheckoutTask(driver);
    FinishTask finishTask = new FinishTask(driver);

    @ParameterizedTest
    @MethodSource("Framework.Utils.DataClass#loginTestData")
    public void realizarCompra( String user, String password){

        try {

            loginTask.efetuarLoginCSV(user,password);
            produtoTask.selecionarProduto();
            checkoutTask.realizarCheckout();
            finishTask.finalizarCompra();


        }catch (Exception e){
            e.getMessage();

        }

    }
}
