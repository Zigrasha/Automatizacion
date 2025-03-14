  #Autor: Edgardo Fernandez
  #Fecha Creación: 05/12/2024
  #Tag:     @casuisticaFacebook

  #---------------------------Historial--------------------------------
  #Analista                 | Fecha      | Descripción
  #Edgardo Fernandez        | 05/12/2024 | Creación del documento

  # -----------------Historial de Tag Adicionales----------------------
  #Tag                 |  Descripción


  Feature: Inicio de sesión y navegación en Facebook

    Background:
      Given Usuario se encuentra en la pagina de facebook

    @casuisticaFacebook
    Scenario: Verificar inicio de sesión y navegación en notificaciones
      When Se muestra la pantalla de inicio de sesion
      And el usuario ingresa incorrectamente con "QANoValido@QANO.NO" y "otroDiaMasAutomatizando"
      Then se muestra un mensaje de error de autenticacion
      When el usuario ingresa informacion correcta "edgardofernandez128@gmail.com" y "ssssss"
      Then el usuario inicia sesión correctamente
      When navega a la sección de Notificaciones
      And  realiza un scroll vertical
      And  selecciona una notificacion aleatoria
      Then se carga el post de la notificacion seleccionada
      When el usuario da Me gusta al post cargado
      Then el post muestra que recibio el Me gusta correctamente
