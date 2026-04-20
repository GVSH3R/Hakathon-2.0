# Hakathon-2.0 | Agenda de Contactos en Java

---

## 1. Descripción:

Este proyecto fue desarrollado como parte de un Hackathon académico, siguiendo una rúbrica que evalúa estructura, funcionalidad, calidad del código y presentación.

La aplicación implementa una agenda telefónica en Java que permite gestionar contactos mediante un menú de consola. Cada contacto está definido por nombre, apellido y teléfono. La agenda tiene un tamaño máximo configurable (por defecto 10 contactos).

---

## 2. Funcionalidades principales:

1. Añadir contacto: agrega un nuevo contacto si hay espacio y no existe duplicado de nombre+apellido.

2. Existe contacto: verifica si un contacto ya está registrado.

3. Listar contactos: muestra todos los contactos ordenados alfabéticamente.

4. Buscar contacto: localiza un contacto por nombre y apellido y devuelve su teléfono.

5. Eliminar contacto: elimina un contacto existente.

6. Modificar teléfono: actualiza el número de un contacto.

7. Agenda llena: indica si ya no hay espacio disponible.

8. Espacios libres: muestra cuántos contactos más se pueden agregar.

### 2.1. Organización de Packages:

---

## 3. Tecnologías utilizadas

- Java 17

- Colecciones (HashSet, List, Streams)

- JUnit 5 para pruebas unitarias

- Programación orientada a objetos (OOP)

---

## 4. Estructura del proyecto

    ├── src
    │   ├── main
    │   │   └── java
    │   │       ├── Contacto.java
    │   │       ├── Agenda.java
    │   │       └── Main.java
    │   └── test
    │       └── java
    │           └── AgendaTest.java

---

## 5. Pruebas unitarias

Se implementaron pruebas con JUnit 5 para validar:

- Añadir y buscar contactos

- Evitar duplicados de nombre+apellido

- Permitir duplicados de teléfono

- Modificar teléfono

- Eliminar contacto

### 5.1. Ejemplo:

    @Test
    void testAñadirYBuscar() {
        Agenda agenda = new Agenda();
        Contacto c = new Contacto("Ana", "Lopez", "12345");
        assertTrue(agenda.añadirContacto(c));
        assertTrue(agenda.buscarContacto("Ana", "Lopez").isPresent());
    }

---

## 6. Evaluación según rúbrica:

1. **Estructura (30 pts)**: Clases bien definidas, menú por consola.

2. **Funcionalidad (40 pts)**: Métodos implementados correctamente.

3. **Calidad del código (30 pts):** Buen uso de OOP, CamelCase, comentarios claros.

4. **Presentación**: Recurso visual (PPT o video), comunicación clara.

---

## 7. Ejecución:

### 7.1. Clonar el repositorio:

git clone https://github.com/usuario/agenda-contactos-java.git

### 7.2. Compilar y ejecutar:

    cd agenda-contactos-java
    javac src/main/java/*.java
    java Main

---

## 8. Autores:
- Leilani
- Diana
- Gustavo
- Martín
- Edwin
- Christopher

*Proyecto desarrollado por estudiantes como parte del Hackathon 2.*

---

## 9. Licencia

*Este proyecto se distribuye bajo la licencia MIT*
