Feature: Automatización de Inicio de Sesión
  Como usuario
  Quiero iniciar sesión en mi cuenta
  Para poder acceder a la aplicación

  Scenario: : Iniciar sesión con credenciales válidas
    Given que estoy en la página de inicio de sesión
    When selecciono ingreso por DNI
    And ingreso mi nombre de usuario "76299224" y mi contraseña "Rompenalgas0"
    And hago clic en el botón de iniciar sesión
    Then debería iniciar sesión correctamente