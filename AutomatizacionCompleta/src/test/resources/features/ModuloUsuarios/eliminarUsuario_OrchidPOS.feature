# language: es
# author: SergioPinzon

Característica: Visualizar eliminacion de un usuario
  Como usuario de OrchidPOS autenticado
  Quiero visualizar la eliminacion de un usuario en OrchidPOS

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de OrchidPOS
    Cuando ingrese las credenciales correctas (usuario y contrasena)

      |          email            |        clave         |
      |     admin@example.com     |     admin_password   |

  @eliminarPerfil

  Escenario: Visualizar Eliminacion de Usuario
    Cuando El usuario ingrese a la pagina usuario debera acceder al aparatado de eliminar usuario
    Entonces Debe mostrarse correctamente la eliminacion del usuario