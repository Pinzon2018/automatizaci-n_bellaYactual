  #language: es
  #author: Sergio Pinzon

  Característica: Visualizar el cierre de sesion del usuario
    Como usuario previamente autenticado
    Quiero visualizar el cierre de sesion

    Antecedentes:
      Dado que el usuario se encuentra en la pagina de inicio de sesion de OrchidPOS
      Cuando ingrese las credenciales correctas (usuario y contrasena)
        |          email            |        clave         |
        |     admin@example.com     |     admin_password   |

    @cerrarSesion

    Escenario: Visualizar el cierre de sesion
      Cuando seleccione el botón de LogOut
      Entonces Debe mostrarse correctamente el cierre de sesion
