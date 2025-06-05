#language:es
  #author:Paula Arias

Característica:Creación de subcategoria
Como usuario de OrchidPOS
Quiero agregar una nueva subcategoria
para clasificar los productos de manera mas específica

Antecedentes:
Dado que el usuario se encuentra en la homepage de OrchidPOS
Cuando ingrese las credenciales correctas (usuario y contrasena)
| usuario | contraseña |
| admin@example.com    | admin_password   |

@creacion_subcategoria

Escenario: Crear subcategoria
Cuando ingrese datos validos en los campos (nombre, descripcion y categoria)
| nombreSubcategoria | descripcionSubcategoria | selectCategoria |
| Shampoos  | cabello rizado  | "cabello"!|
Entonces se debe visualizar la nueva categoria agregada con su respectiva información