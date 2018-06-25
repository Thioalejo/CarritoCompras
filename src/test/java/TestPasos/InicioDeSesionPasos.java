/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPasos;

import static Util.Constantes.driver;
import static Util.Constantes.elementoCapturado;
import Util.Definidas;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;
import org.openqa.selenium.By;

/**
 *
 * @author alejo
 */
public class InicioDeSesionPasos {

    public InicioDeSesionPasos() {
    }

    @Given("^que he ingresado el usuario (.*) y la clave (.*)$")
    public void IniciarSesion(String usuario, String clave) throws Throwable {

        Definidas.esperarSegundos(3);
        Definidas.iniciarSesionConUsuarioYClave(usuario, clave);

    }

    @And("^presiono el boton Login$")
    public void presionarElboton() throws Throwable {
        elementoCapturado = driver.findElement(By.className("button"));
        elementoCapturado.click();
        Definidas.esperarSegundos(3);
    }

    @Then("^deberia ver la pagina de carrito de compras con el titulo en su primer recuadro (.*)$")
    public void verTitulo(String tituloRecibido) throws Throwable {
        //Valida que efectivamente se inicio sesion.
        //elementoCapturado = driver.findElement(By.xpath("//*[@id=\"available\"]/h2"));
        assertTrue(driver.findElement(By.xpath("//*[@id=\"available\"]/h2")).getText().contains(tituloRecibido));
    }

    @Then("^deberia ver el mensaje de error (.*)$")
    public void verMensajeError(String mensajeDeError) throws Throwable {
        //Valida que efectivamente se inicio sesion.

        assertTrue(driver.findElement(By.id("errorMessage")).getText().contains(mensajeDeError));
    }

}
