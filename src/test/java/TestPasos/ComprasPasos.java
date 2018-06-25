/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPasos;

import static Util.Constantes.elementoCapturado;
import Util.Definidas;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 *
 * @author alejo
 */
public class ComprasPasos extends Util.Constantes {

    public ComprasPasos() {
    }

    @Given("^que me encuentro en la pagina de compra quiero agregar (.*) libros de Core Java, (.*) de Ruby for Rails y (.*) Python Cookbook$")
    public void agregarLibrosParaCompra(String CoreJava, String RubyforRails, String Python) throws Throwable {
        Definidas.esperarSegundos(3);
        Definidas.AgregarAlCarritoDeComprasLibrosDeseados(Integer.parseInt(CoreJava), Integer.parseInt(RubyforRails), Integer.parseInt(Python));
    }

    @And("^luego de agregar todos los libros presiono el boton de agregar$")
    public void presionarElboton() throws Throwable {
        Definidas.encontrarElementoXpath("//*[@id=\"available\"]/input[1]");
        elementoCapturado.click();
        Definidas.esperarSegundos(3);
    }

    @Then("^deberia tener el valor total de los libros agregados en la seccion inferior My Cart con un total de (.*)$")
    public void verValorTotalAPagar(String valorTotal) throws Throwable {

        Definidas.validarQueElValorTotalSeaCorrectoSegunProductosAgregados(valorTotal);
        Definidas.esperarSegundos(3);

    }

}
