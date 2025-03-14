
  Feature: Logeo e Ingreso a Forms Atlantic

    Background:
      Given Usuario se encuentra en la pagina de atlantic

    @casuisticaFacebook
    Scenario: Verificar logeo e Ingreso a Forms Atlantic
      When Se muestra la pantalla de inicio de atlantic
      And el usuario selecciona el boton registrar
      Then se muestra el modal de registro
      When el usuario ingresa informacion nombre "EDGARDO JOAQUIN"
      And  ingresa el apellido paterno "FERNANDEZ"
      And  ingresa el apellido materno "ALTAMIRANO"
      And  selecciona la nacionalidad peruana
      And  ingresa el DNI "76299224"
      And  selecciona la fecha de nacimiento con dia "05", mes "04" y ano "2002"
      And  ingresa el celular "910093302"
      And  ingresa el correo "edgardofernandez128@gmail.com"
      And  selecciona el boton siguiente
      Then se visualiza un nuevo apartado de registro