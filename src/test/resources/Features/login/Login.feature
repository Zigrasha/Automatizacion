Feature: Login desde formulario de ingreso en OrangeHRM

  Background:
    Given Usuario se encuentra en la pagina de OrangeHRM

  @LoginExitoso
  Scenario: Login exitoso en OrangeHRM
    When ingresa el username "Admin"
    And ingresa la contrasena "admin123"
    And selecciona el boton login
    Then usuario ingresa exitosamente
