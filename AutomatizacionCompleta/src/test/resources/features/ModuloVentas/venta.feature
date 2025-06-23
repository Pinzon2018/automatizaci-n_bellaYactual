# language: es
# encoding: utf-8
#author: Paula Arias

Característica: Registrar una venta en el sistema
  Como usuario autenticado de OrchidPOS
  Quiero agregar productos al punto de venta
  Para generar una venta y almacenarla en el historial

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de OrchidPOS
    Cuando ingrese las credenciales correctas (usuario y contrasena)
      |          email            |        clave         |
      |     admin@example.com     |     admin_password   |

  @venta

  Esquema del escenario: Verificar que la venta haya sido concluida y registrada correctamente
    Cuando ingrese datos válidos en el formulario de venta (Id Producto y Cantidad)
      | idProducto | cantidad |
      | <idProd>   | <cant>   |
    Entonces se deben visualizar los detalles de la venta y el registro correspondiente en el historial

    Ejemplos:
      | idProd | cant |
      | 1      | 3    |
