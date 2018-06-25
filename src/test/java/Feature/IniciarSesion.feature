
Feature: Iniciar sesion en la pagina web de venta de libros
  Yo como usuario cliente de la pagina web de venta de libros, quiero iniciar sesion con mi usuario y contraseña 
    
Background: 
    Given que he ingresado a la pagina http://sahitest.com/demo/training/login.htm 

    Scenario: Iniciar sesion con usuario y clave   
    Given que he ingresado el usuario test y la clave secret
    And presiono el boton Login
    Then deberia ver la pagina de carrito de compras con el titulo en su primer recuadro All available books
    And por ultimo salgo del navegador web

    Scenario: Intentar iniciar sesion con usuario invalido   
        Given que he ingresado el usuario testo y la clave secret
        And presiono el boton Login
        Then deberia ver el mensaje de error Invalid username or password
        And por ultimo salgo del navegador web

    Scenario: Intentar iniciar sesion con clave invalida   
        Given que he ingresado el usuario test y la clave secreto
        And presiono el boton Login
        Then deberia ver el mensaje de error Invalid username or password
        And por ultimo salgo del navegador web