Feature: Apertura del Formulario de Depósito en la Plataforma de Atlantic City

  Background:
    Given Usuario se encuentra en la pagina de Atlantic

  @Prueba
  Scenario: Apertura exitosa del formulario de deposito
    When el usuario selecciona la opción para iniciar sesion
    And ingresa el usuario "alias5"
    And ingresa la contrasena "Contra123"
    Then accede exitosamente a su cuenta
    When selecciona el boton de deposito
    Then se muestra correctamente el formulario de deposito
