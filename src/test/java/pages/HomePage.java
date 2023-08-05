package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void acessarAplicacao(){
        driver.get("https://www.qazando.com.br/");
        driver.manage().window().maximize();
        Assert.assertEquals("PASSOU",true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);
    }

    public void preencheEmail(){
        driver.findElement(By.id("email")).sendKeys("luisitalomoreirasouza@gmail.com");
    }
    public void ganharDescClick(){
        driver.findElement(By.className("form-content")).click();
        driver.findElement(By.id("button")).click();
    }
    public void verifiCupom(){
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals("PASSOU","QAZANDO15OFF", texto_cupom);
    }
}
