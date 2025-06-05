#language:es
  #author:Paula Arias

Característica: Realizar una venta
  Como usuario de OrchidPOS
  Quiero agregar productos en el punto de venta
  Para generar una venta

  Antecedentes:
    Dado que el usuario se encuentra en la homepage de OrchidPOS
    Cuando ingrese las credenciales correctas (usuario y contrasena)
      | usuario | contraseña |
      | admin@example.com    | admin_password   |

  @venta

  Escenario: Verificar que la venta haya sido concluida y registrada
    Cuando ingrese datos validos en (Id Producto y Cantidad)
      | idProducto | cantidad |
      | 1   | 3   |
    Entonces se deben visualizar los detalles de la venta y el registro de esta en el historial de ventas