package TestCases;

import Framework.TestBase;
import Tasks.LoginTask;
import Tasks.ProdutoTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizarCompraSucessoTest extends TestBase {

    private final WebDriver driver = getDriverManager();

    LoginTask loginTask = new LoginTask(driver);
    ProdutoTask produtoTask = new ProdutoTask(driver);

    @Test
    public void realizarCompra(){

        try {

            loginTask.efetuarLogin();
            produtoTask.selecionarProduto();


        }catch (Exception e){
            e.getMessage();

        }

    }
}
