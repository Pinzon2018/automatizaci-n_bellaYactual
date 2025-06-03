# language: es
# author: SergioPinzon

Característica: Visualizar perfil en OrchidPOS
  Como usuario de OrchidPOS autenticado
  Quiero visualizar mi perfil en OrchidPOS

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de OrchidPOS
    Cuando ingrese las credenciales correctas (usuario y contrasena)
      |          email            |        clave         |
      |     admin@example.com     |     admin_password   |

  @perfil

  Escenario: Visualizar Perfil de Usuario
    Cuando El usuario ingrese a la pagina de perfil
    Entonces Debera mostrarse los datos del usuario