#language:es

Característica: Eliminación de productos en el sistema
  Como usuario del sistema, necesito eliminar productos
  Para mantener el inventario actualizado.

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de OrchidPOS
    Cuando ingrese las credenciales correctas (usuario y contrasena)
      | email             | clave          |
      | admin@example.com | admin_password |

  @eliminacionProductos
  Escenario: Eliminar un producto existente exitosamente
    Cuando el usuario elimine el producto "Crema Hidratante"
    Entonces el producto "Crema Hidratante" no debería aparecer en la lista
















