## Descripción del Problema

---
---

El objetivo de este proyecto es desarrollar un sistema de gestión de productos para una tienda. Actualmente, el proceso de registro y seguimiento de los productos se realiza de forma manual, lo que conlleva a errores y dificultades en el cálculo de estadísticas relevantes.
---
## Aproximación Plantilla Historia de Usuario:
![image](https://github.com/MiguelSanchez12/Zalzamentaria.github.io/assets/136994004/1b76d330-5874-4bd3-a3be-0582aa583fed)

---
---
## Aproximación Caso de Uso:

![image](https://github.com/MiguelSanchez12/zalzamentariaz.github.io/assets/136994004/ad8d30a3-d185-4ea4-b3a1-5977bb9b7005)


**Título del Caso de Uso:** Gestión de productos en una tienda

**Actor Principal:** Coordinador de la tienda

**Breve Descripción:** El coordinador de la tienda puede gestionar los productos, registrando su información y calculando estadísticas. Puede ingresar el nombre, código, precio y cantidad de cada producto. El sistema registra las compras, calcula el precio total de cada una y muestra la información de los productos, así como el promedio del precio total de las compras.

**Flujo Básico:**

1. El coordinador de la tienda ingresa el nombre, código, precio y cantidad de cada producto.
2. El sistema registra la información de cada producto y calcula el precio total multiplicando el precio por la cantidad.
3. El sistema calcula el precio total de todas las compras y el promedio del precio total.
4. El sistema muestra la información de cada producto, incluyendo su nombre, código, precio, cantidad y precio total.
5. El sistema muestra el promedio del precio total de las compras.
---
---
## Aproximación Diagrama de Flujo:
![AdministradorTienda](https://github.com/MiguelSanchez12/zalzamentariaz.github.io/assets/136994004/21ad0d43-3a85-4c5e-84a6-c350498cff94)

---
---
## Aproximación Seudocódigo:
### Algoritmo AdministradorTienda

- Dimensionar `codigos(50)`, `nombres(50)`, `cantidades(50)`, `precios(50)`
- Definir `numeroProductos` como Entero
- Definir `sumaPrecios`, `promedioPrecios` como Real
- Definir `mensajeSuma`, `mensajePromedio` como Cadena

- `numeroProductos <- 0`
- `sumaPrecios <- 0`

- Escribir 'Bienvenido a la Salsamentaria.'
- Escribir 'Digite el número de productos a comprar:'
- Leer `numeroProductos`

- Para `i` <- 1 hasta `numeroProductos` con paso 1 hacer
  - Escribir ''
  - Escribir 'Producto '+ConvertirATexto(i)+':'
  - Escribir 'Digite el código del producto:'
  - Leer `codigos[i]`
  - Escribir 'Digite el nombre del producto:'
  - Leer `nombres[i]`
  - Escribir 'Digite el precio del producto:'
  - Leer `precios[i]`
  - Escribir 'Digite la cantidad de productos a llevar:'
  - Leer `cantidades[i]`
  - `totalProducto <- precios[i]*cantidades[i]`
  - `sumaPrecios <- sumaPrecios+totalProducto`
- Fin Para

- `promedioPrecios <- sumaPrecios/numeroProductos`
- `mensajeSuma <- 'Suma total de los precios: $'+ConvertirATexto(sumaPrecios)`
- `mensajePromedio <- 'Promedio de los precios: $'+ConvertirATexto(promedioPrecios)`

- Escribir ''
- Escribir 'Detalle de la compra:'
- Para `i` <- 1 hasta `numeroProductos` con paso 1 hacer
  - Escribir 'Producto '+ConvertirATexto(i)+':'
  - Escribir 'Código: '+codigos[i]
  - Escribir 'Nombre: '+nombres[i]
  - Escribir 'Precio: $'+ConvertirATexto(precios[i])
  - Escribir 'Cantidad: '+ConvertirATexto(cantidades[i])
- Fin Para

- Escribir `mensajeSuma`
- Escribir `mensajePromedio`
