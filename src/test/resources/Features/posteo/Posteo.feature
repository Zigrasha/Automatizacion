Feature: Publicacion desde el modulo Buzz

  Background:
  Given Usuario se encuentra en la pagina de OrangeHRM
    When ingresa el username "Admin"
    And ingresa la contrasena "admin123"
    And selecciona el boton login
    Then usuario logra ingresar

  @PublicacionExitosa
  Scenario: Publicacion exitosa en el modulo Buzz
    When el usuario navega a la seccion Buzz
    And ingresa comentario "estoy pensando"
    And hace clic en el boton Post
    Then la publicacion es exitosa