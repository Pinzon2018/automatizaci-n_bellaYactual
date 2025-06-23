#language:es

Característica: Registro de un nuevo producto en el sistema

  Como usuario del sistema, necesito registrar nuevos productos
  Para mantener el inventario actualizado.

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de OrchidPOS
    Cuando ingrese las credenciales correctas (usuario y contrasena)
      | email               | clave            |
      | admin@example.com   | admin_password   |

  @RegistroProducto

  Esquema del escenario: Registro exitoso de un producto con credenciales de usuario validas
    Cuando el usuario acceda al modulo de productos e ingrese los datos del producto y haga click en Registrar
      |  nombreProd  | medidaProd   | precioBrutoProd   | ivaProd   | porcentajeGanancia    | unidadesTotalesProd   | estadoProd    | marcaProd    | proveedor | categoria |
      | <nombreProd> | <medidaProd> | <precioBrutoProd> | <ivaProd> | <porcentajeGanancia>  | <unidadesTotalesProd> | <estadoProd>  | <marcaProd>  | <proveedor> | <categoria> |
    Entonces se debe verificar que el producto "Crema Hidratante" haya sido registrado correctamente

    Ejemplos:
      | nombreProd       | medidaProd | precioBrutoProd | ivaProd | porcentajeGanancia | unidadesTotalesProd | estadoProd | marcaProd   | proveedor     | categoria |
      | Labial Rojo      | 140ml      | 7500            | 0.19    | 0.20               | 27                  | Disponible | Arroz diana | CremasÑoÑa    | Piel      |
