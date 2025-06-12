#language:es

Característica: Registro de un nuevo producto en el sistema
  Como usuario del sistema, necesito registrar nuevos productos
  Para mantener el inventario actualizado.

  Antecedentes:

    Dado que el usuario se encuentra en la pagina de inicio de sesion
    Cuando el usuario ingrese las credenciales de inicio de sesion
      | usuario             | contraseña      |
      | admin@example.com   | admin_password  |
    Entonces se deberia mostrar la pagina de inicio


  @RegistroProducto
  Escenario: Registro exitoso de un producto con credenciales de usuario validas
    Cuando navega al modulo de productos y selecciona la opcion para registrar un producto

    Y completa el formulario de nuevo producto con los siguientes datos
      | nombreProd       | medidaProd | precioBrutoProd | ivaProd | porcentajeGanancia | unidadesTotalesProd | estadoProd | marcaProd| proveedorProd| categoriaProd|
      | Crema Hidratante | 100ml      | 17.500          | 0.19    | 0.25               | 50                   | Disponible | Savital | l'oreal      | cremas       |
    Entonces el nuevo producto "Crema Hidratante" deberia ser registrado exitosamente