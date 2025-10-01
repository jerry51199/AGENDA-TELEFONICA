
#  Agenda Telefónica en Java

##  Descripción
Este proyecto implementa una **agenda telefónica en Java** utilizando la clase `AddressBook`, que permite:
- Crear contactos.
- Listar contactos.
- Eliminar contactos.
- Guardar y cargar los datos desde un archivo **CSV**.

El programa cuenta con un **menú interactivo en consola** que facilita la interacción con el usuario.

---

##  Tecnologías utilizadas
- Java 17+ (compatible con versiones anteriores).
- Estructura de datos **HashMap** para almacenar los contactos.
- Lectura y escritura de archivos con clases de entrada/salida de Java.

---

##  Funcionalidades principales
- **load()**: carga los contactos desde el archivo CSV.
- **save()**: guarda los contactos en el archivo CSV.
- **list()**: muestra la lista de contactos en consola.
- **create()**: permite agregar un nuevo contacto.
- **delete()**: elimina un contacto existente.

---

El archivo es un **CSV** (Comma Separated Values), donde cada línea representa un contacto en el formato:

```
Número,Nombre
```

Ejemplo:

```
8149105222,Gerardo Sanchez
8116953488,Yadira Santiago
8110442327,Carlos Sanchez
```

---

##  Ejemplo de ejecución en consola

```
===== Menú Agenda Telefónica =====
1. Listar contactos
2. Crear contacto
3. Eliminar contacto
4. Guardar y salir
Elige una opción: 1

Contactos:
8149105222,Gerardo Sanchez
8116953488,Yadira Santiago
8110442327,Carlos Sanchez
```

---


##  Mejoras futuras (opcional)
- Búsqueda de contactos por nombre o número.
- Edición de contactos.
- Validación de formato de número telefónico.
- Interfaz gráfica con **JavaFX** o **Swing**.
- Exportación a otros formatos (JSON, XML).
