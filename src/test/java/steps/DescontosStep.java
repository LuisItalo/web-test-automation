package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


import pages.HomePage;
import runner.RunTest;

public class DescontosStep extends RunTest {

    HomePage homePage = new HomePage(driver);

    @Dado("que estou no site da qazando$")
    public void acessar_site_qazando(){
        homePage.acessarAplicacao();
    }

    @Quando("^preencho meu email$")
    public void preencho_meu_email() throws InterruptedException {
        homePage.scrollDown();
        homePage.preencheEmail();
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() {
        homePage.ganharDescClick();
    }

    @Entao("^vejo o codigo de desconto$")
    public void vejo_o_codigo_de_desconto() {
        homePage.verifiCupom();
    }
}
