package br.com.util.pages;

import br.com.util.Base;
import br.com.util.objects.LoginObjects;
import br.com.util.setup.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Correios extends DriverManager {
    private final Base base;

    public Correios(WebDriver driver) {
        DriverManager.driver = driver;
        base = new Base(driver);
    }


    public void validarTelaCep() throws InterruptedException {
        base.verifyUrl("endereco/index.php");
    }

    public void pesquisaCep(String cep) {
        base.fillText(By.id("endereco"), cep);
    }

    public void TipoCep(String tipo) throws InterruptedException {

        base.findOptionDropDown(tipo, By.xpath("//div[@class=\"controle\"]/select/option"));
        base.clickElement(By.id("btn_pesquisar"));
        base.waitForPageLoaded();
    }

    public void ValidarCepLista(String cep) {
        List<WebElement> Enderecos = driver.findElements(By.xpath("//tbody/tr"));

        for (WebElement element : Enderecos) {
            System.out.println(element.getText());

        }
    }
}
