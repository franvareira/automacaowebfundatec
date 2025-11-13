package TestCases;

import Framework.TestBase;
import Tasks.LoginTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizarCompraSucessoTest extends TestBase {

    private final WebDriver driver = getDriverManager();

    LoginTask loginTask = new LoginTask(driver);

    @Test
    public void realizarCompra(){

        try {

            loginTask.efetuarLogin();


        }catch (Exception e){
            e.getMessage();

        }

    }
}
