@Login @Regresion
Feature: Login desde formulario de ingreso en OrangeHRM

  Background:
    Given Usuario se encuentra en la pagina de OrangeHRM

  @LoginExitoso
  Scenario Outline: Login exitoso en OrangeHRM
    When ingresa el username "<user>"
    And ingresa la contrasena "<pass>"
    And selecciona el boton login
    Then usuario ingresa exitosamente

    Examples:
    |user|pass|
    |Admin|admin123|

  @LoginNoExitoso
  Scenario Outline: Login no exitoso en OrangeHRM
    When ingresa el username "<user>"
    And ingresa la contrasena "<pass>"
    And selecciona el boton login
    Then usuario no ingresa

    Examples:
    |user|pass|
    |Gael|1234|