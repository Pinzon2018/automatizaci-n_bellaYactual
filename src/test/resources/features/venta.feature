#language:es
  #author:Paula Arias

Característica: Realizar una venta
  Como usuario de OrchidPOS
  Quiero agregar productos en el punto de venta
  Para generar una venta

  @venta

  Escenario: Verificar que la venta haya sido concluida y registrada
    Dado que el usuario ha ingresado al punto de venta
    Cuando ingrese datos validos en (Id Producto y Cantidad)
      | IdProducto | cantidad |
      | 2   | 3   |
    Y haga click en el boton finalizar venta
    Entonces se deben visualizar los detalles de la venta y el registro de esta en el historial de ventas