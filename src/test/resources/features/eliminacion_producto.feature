#language:es

Característica: Eliminacion de productos en el sistema
  Como usuario del sistema, necesito eliminar productos
  Para mantener el inventario actualizado.

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion
    Cuando el usuario ingrese las credenciales de inicio de sesion
      | usuario             | contraseña      |
      | admin@example.com   | admin_password  |
    Entonces se deberia mostrar la pagina de inicio

  Escenario: Eliminar un producto existente exitosamente
    Dado que el producto "Crema Hidratante" existe en la lista de productos
    Cuando el usuario elimina el producto "Crema Hidratante"
    Entonces el producto "Crema Hidratante" no deberia aparecer en la lista















