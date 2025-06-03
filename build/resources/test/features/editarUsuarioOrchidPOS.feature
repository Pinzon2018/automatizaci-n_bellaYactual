#language: es
#author: SergioPinzon

Característica: Visualizar la actulizacíon de un Usuario
  Como usuario autenticado de ORchidPOS
  Quiero editar un usuario del sistema

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de OrchidPOS
    Cuando ingrese las credenciales correctas (usuario y contrasena)
      | email               | clave            |
      | admin@example.com   | admin_password   |

  @editarUsuario

  Esquema del escenario: Editar un usuario exitosamente
    Cuando accede a la página de usuarios luego al apartado de editar usuarios e ingrese los datos para actualizar usuario y haga click en "Guardar Cambios"
      | nombre   | contraseña   | cedula   | email   | telefono    | fechaContrato   | rol    |
      | <nombre> | <contraseña> | <cedula> | <email> | <telefono>  | <fechaContrato> | <rol>  |
    Entonces se debe verificar que el usuario haya sido actualizado correctamente

    Ejemplos:
      | nombre   | contraseña | cedula   | email            | telefono    | fechaContrato | rol      |
      | Andres   | 1234@      | 10234232 | andres@gmail.com | 2131221321  | 22/01/2025    | Empleado |
