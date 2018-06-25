
Feature: Fight or flight
   
   Scenario: Se debe navegar en la pagina dada, y se debe regresar a la pagina inicial mediante el boton atras
      Given que he ingresado a la pagina Http://sahitest.com/demo/jsPopup.htm     
      Then debo ver la pagina con el titulo Js Popup Test
      And luego ingreso al hipervinculo Back
      Then debo ver la pagina con el titulo Sahi Tests
      And luego ingreso al hipervinculo Link Test
      Then debo ver la pagina con el titulo Link Test
      And regreso a la pagina anterior
      And luego ingreso al hipervinculo Table Test
      And regreso a la pagina anterior
      And regreso a la pagina anterior
      Then debo ver la pagina con el titulo Js Popup Test
      And por ultimo salgo del navegador web