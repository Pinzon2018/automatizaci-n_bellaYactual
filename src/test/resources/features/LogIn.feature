#language:es
  #author:Paula Arias

Característica: Autenticarse en  OrchidPOS
  Como usuario de OrchidPOS
  Quiero autenticarme en la pagina de OrchidPOS
  Para poder realizar ventas y consultar inventario

  @autenticacion

  Escenario: Verificar la autenticacion exitosa en OrchidPOS
    Dado que el usuario se encuentra en la homepage de OrchidPOS
    Cuando ingrese las credenciales correctas (usuario y contrasena)
      | usuario | contraseña |
      | admin@example.com    | admin_password   |
    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido al homepage de su cuenta