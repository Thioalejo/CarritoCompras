/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPasos;

import static Util.Constantes.NavegadorChrome;
import static Util.Constantes.RutaNavegadorChrome;
import static Util.Constantes.driver;
import static Util.Constantes.elementoCapturado;
import Util.Definidas;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author alejo
 */
public class NavegarEnPaginaPasos extends Util.Constantes {

    public NavegarEnPaginaPasos() {
    }

    @Given("^que he ingresado a la pagina (.*)$")
    public void ingresarALaUrl(String url) throws Throwable {
        System.setProperty(NavegadorChrome, RutaNavegadorChrome);
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @And("^luego ingreso al hipervinculo (.*)$")
    public void Navegar(String hiperviculo) throws Throwable {
        elementoCapturado = driver.findElement(By.partialLinkText(hiperviculo));
        elementoCapturado.click();
        Definidas.esperarSegundos(3);

    }

    @And("^regreso a la pagina anterior$")
    public void regresarAtras() throws Throwable {
        driver.navigate().back();
        Definidas.esperarSegundos(3);

    }

    @Then("^debo ver la pagina con el titulo (.*)$")
    public void verTitulo(String tituloRecibido) throws Throwable {
        //Valida que efectivamente se inicio sesion.
        //elementoCapturado = driver.findElement(By.xpath("//*[@id=\"available\"]/h2"));
        assertTrue(driver.findElement(By.xpath("/html/body/h2")).getText().contains(tituloRecibido));

    }

    @Then("^por ultimo salgo del navegador web$")
    public void salirDelNavegador() throws Throwable {
        driver.quit();
    }

}
