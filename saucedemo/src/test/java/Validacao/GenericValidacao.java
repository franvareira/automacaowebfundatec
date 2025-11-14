package Validacao;

import PageObjects.GenericPage;
import PageObjects.ProdutoPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class GenericValidacao {

    private WebDriver driver;
    private GenericPage genericPage;

    public GenericValidacao(WebDriver driver){

        this.driver = driver;
        genericPage = new GenericPage(this.driver);
    }

    public void validationTitlePages(String texto){

        try{
            String label = genericPage.getTextTitle().getText();
            Assertions.assertEquals(texto,label);
        }catch (Exception e){
            e.getMessage();
        }
    }

    public void validationProduto(){
            try{
                String labelProduto = genericPage.getTextProduto().getText();
                Assertions.assertEquals("Test.allTheThings() T-Shirt (Red)",labelProduto);
            }catch (Exception e){
                e.getMessage();
            }
        }



    }

