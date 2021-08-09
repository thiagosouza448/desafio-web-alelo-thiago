package br.com.util.steps;

import br.com.util.pages.Correios;
import br.com.util.setup.DriverManager;
import br.com.util.Base;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;



public class CorreioSteps extends DriverManager {


    private final Correios correios;
    private Base base;


    public CorreioSteps() {
        correios = new Correios(driver);

    }



    @Dado("que eu esteja na tela dos correios")
    public void queEuEstejaNaTelaDosCorreios() throws InterruptedException {
        correios.validarTelaCep();
        
    }

    @Quando("quando pesquiso um endereco {string}")
    public void quandoPesquisoUmCep(String cep) throws InterruptedException {
        correios.pesquisaCep(cep);
        correios.TipoCep("Localidade/Logradouro");
    }

    @Entao("valido se o {string} foi encontrado na lista")
    public void validoSeOFoiEncontradoNaLista(String cep) {
        correios.ValidarCepLista(cep);
    }
}
