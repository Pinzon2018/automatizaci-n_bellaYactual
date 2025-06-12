#language:es

  Característica: Edicion de productos en el sistema
    Como usuario del sistema, necesito editar productos
    Para mantener el inventario actualizado.


  Antecedentes:
    Dado que el usuario ha iniciado sesion en el sistema


    Escenario: Editar un producto existente y cambiar su nombre
      Y el producto "Crema Hidratante" existe en la lista con los datos iniciales
        | nombreProd       | medidaProd | precioBrutoProd | ivaProd | porcentajeGanancia | unidadesTotalesProd | estadoProd | marcaProd| proveedorProd| categoriaProd|
        | Crema Hidratante | 100ml      | 17.500          | 0.19    | 0.25               | 50                   | Disponible | Savital | l'oreal      | cremas       |

      Cuando el usuario edita el producto "Crema Hidratante" a "shampoo Anticaspa" con los siguientes datos
        | nombreProd       | medidaProd | precioBrutoProd | ivaProd | porcentajeGanancia | unidadesTotalesProd | estadoProd | marcaProd| proveedorProd| categoriaProd|
        | Shampoo Anticaspa| 1000ml      | 35.500         | 0.19    | 0.15               | 20                  | Disponible | Savital  | l'oreal      | cremas       |

      Entonces el producto "Shampoo Anticaspa" deberia mostrar los cambios actualizados
        | nombreProd       | medidaProd | precioBrutoProd | ivaProd | porcentajeGanancia | unidadesTotalesProd | estadoProd | marcaProd| proveedorProd| categoriaProd|
        | Shampoo Anticaspa| 1000ml      | 35.500         | 0.19    | 0.15               | 20                  | Disponible | Savital  | l'oreal      | cremas       |



