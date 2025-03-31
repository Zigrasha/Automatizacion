Feature: Interaccion job Titles en el modulo Admin de OrangeHRM

  Background:
    Given Usuario se encuentra en la pagina de OrangeHRM
    When ingresa el username "Admin"
    And ingresa la contrasena "admin123"
    And selecciona el boton login
    Then usuario logra ingresar

  @TituloExitoso
  Scenario: Titulo exitoso en el modulo Admin
    When el usuario navega a la sección Admin
    And selecciona el botón Job
    And selecciona la opción Job Titles
    And presiona el botón + Add
    And ingresar el titulo "Ingeniero en Sistemas"
    And hacer clic en el boton Save
    Then titulo creado exitosamente

  @TituloBorrado
  Scenario: Titulo borrado en el modulo Admin
    When el usuario navega a la sección Admin
    And selecciona el botón Job
    And selecciona la opción Job Titles
    And selecciona titulo
    And elimina titulo
    Then titulo borrado exitosamente