
Feature: Iniciar sesion en la pagina para comprar libros
  Yo como usuario cliente de la pagina web carrito de compras de libros, quiero realizar la compra de algunos libros 
    

   Background: Iniciar sesion con usuario y clave valida
    Given que he ingresado a la pagina http://sahitest.com/demo/training/login.htm 
    Then que he ingresado el usuario test y la clave secret
    And presiono el boton Login
    

    Scenario: Agregar al carrito de compras los libros que se desee comprar   
        Given que me encuentro en la pagina de compra quiero agregar 2 libros de Core Java, 5 de Ruby for Rails y 2 Python Cookbook
        And luego de agregar todos los libros presiono el boton de agregar
        Then deberia tener el valor total de los libros agregados en la seccion inferior My Cart con un total de 2300
        And por ultimo salgo del navegador web