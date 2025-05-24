#language:es
  #author:Paula Arias

Característica: Registrar un usuario en el sistema de inventario OrchidPOS
  Como usuario con rol administrador
  Quiero registrar un usuario desde la pagina registro de usuarios
  Para visualizarlo en la lista de usuarios.

  @registrarusuario

  Escenario: Verificar el registro exitoso de un usuario nuevo
    Dado que el usuario se encuentra autenticado
    Cuando ingrese las credenciales correctas (usuario y contrasena)
      | usuarios | clave |
      | john     | 2345   |
    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina de inicio de Facebook