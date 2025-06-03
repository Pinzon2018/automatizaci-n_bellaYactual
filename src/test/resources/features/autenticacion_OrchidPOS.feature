#language:es
  #author:SergioPinzon

Característica: Autenticacion en la pagina de OrchidPOS
  Como usuario de OrchidPOS
  Quiero autenticarme en el portal de OrchidPOS
  Para poder acceder al contenido y funcionalidades disponibles en mi cuenta.

  @autenticacion

  Escenario: Verificar la autenticacion exitosa en la pagina de OrchidPOS
    Dado que el usuario se encuentra en la pagina de inicio de sesion de OrchidPOS
    Cuando ingrese las credenciales correctas (usuario y contrasena)
      |          email            |        clave         |
      |     admin@example.com     |     admin_password   |
    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina de inicio de OrchidPOS