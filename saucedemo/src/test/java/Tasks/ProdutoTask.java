package Tasks;

import PageObjects.CartPage;
import PageObjects.GenericPage;
import PageObjects.ProdutoPage;
import Validacao.GenericValidacao;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebDriver;

public class ProdutoTask {

    private WebDriver driver;
    private ProdutoPage produtoPage;
    private CartPage cartPage;
    private GenericValidacao genericValidacao;

    public ProdutoTask(WebDriver driver){

        this.driver = driver;
        produtoPage = new ProdutoPage(this.driver);
        cartPage = new CartPage(this.driver);
        genericValidacao = new GenericValidacao(this.driver);
    }

    public void selecionarProduto(){

        produtoPage.getAddToCartButton().click();
        produtoPage.getCartButton().click();
        genericValidacao.validationTitlePages("Your Cart");
        genericValidacao.validationProduto();
        cartPage.getCheckoutButton().click();

    }

}
