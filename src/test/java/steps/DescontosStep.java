package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DescontosStep {

    WebDriver driver = new FirefoxDriver();

    @Dado("que estou no site da qazando$")
    public void acessar_site_qazando(){
        driver.get("https://www.qazando.com.br/");
    }

    @Quando("^preencho meu email$")
    public void preencho_meu_email() {

    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() {

    }

    @Entao("^vejo o codigo de desconto$")
    public void vejo_o_codigo_de_desconto() {

    }
}
