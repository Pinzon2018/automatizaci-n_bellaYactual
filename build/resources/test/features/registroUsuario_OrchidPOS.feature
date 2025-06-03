#language: es
#author: SergioPinzon

Característica: Visualizar el registro de un Usuario
  Como usuario autenticado de ORchidPOS
  Quiero registrar un nuevo usuario al sistema

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de OrchidPOS
    Cuando ingrese las credenciales correctas (usuario y contrasena)
      | email               | clave            |
      | admin@example.com   | admin_password   |

  @agregarUsuario

  Esquema del escenario: Agregar un Nuevo usuario exitosamente
    Cuando acceda a la página de usuarios e ingrese al apartado de registrar usuario e ingrese los datos de usuario y haga click en "Registrarse"
      | nombre   | contraseña   | cedula   | email   | telefono    | fechaContrato   | rol    |
      | <nombre> | <contraseña> | <cedula> | <email> | <telefono>  | <fechaContrato> | <rol>  |
    Entonces se debe verificar que el usuario haya sido registrado correctamente

    Ejemplos:
      | nombre   | contraseña | cedula   | email            | telefono    | fechaContrato | rol           |
      | Sergio   | 1234       | 12132412 | sergio@gmail.com | 2131221321  | 21/02/2021    | Administrador |
