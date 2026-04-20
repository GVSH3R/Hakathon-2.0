# Hakathon-2.0

Agenda de Contactos en Java

Este proyecto fue desarrollado como parte de un Hackathon académico, siguiendo una rúbrica que evalúa estructura, funcionalidad, calidad del código y presentación.

Descripción

La aplicación implementa una agenda telefónica en Java que permite gestionar contactos mediante un menú de consola. Cada contacto está definido por nombre, apellido y teléfono. La agenda tiene un tamaño máximo configurable (por defecto 10 contactos).

Funcionalidades principales

Añadir contacto: agrega un nuevo contacto si hay espacio y no existe duplicado de nombre+apellido.

Existe contacto: verifica si un contacto ya está registrado.

Listar contactos: muestra todos los contactos ordenados alfabéticamente.

Buscar contacto: localiza un contacto por nombre y apellido y devuelve su teléfono.

Eliminar contacto: elimina un contacto existente.

Modificar teléfono: actualiza el número de un contacto.

Agenda llena: indica si ya no hay espacio disponible.

Espacios libres: muestra cuántos contactos más se pueden agregar.

Tecnologías utilizadas

Java 17

Colecciones (HashSet, List, Streams)

JUnit 5 para pruebas unitarias

Programación orientada a objetos (OOP)

Estructura del proyecto

    ├── src
    │   ├── main
    │   │   └── java
    │   │       ├── Contacto.java
    │   │       ├── Agenda.java
    │   │       └── Main.java
    │   └── test
    │       └── java
    │           └── AgendaTest.java

Pruebas unitarias

Se implementaron pruebas con JUnit 5 para validar:

Añadir y buscar contactos

Evitar duplicados de nombre+apellido

Permitir duplicados de teléfono

Modificar teléfono

Eliminar contacto

Ejemplo:

    @Test
    void testAñadirYBuscar() {
        Agenda agenda = new Agenda();
        Contacto c = new Contacto("Ana", "Lopez", "12345");
        assertTrue(agenda.añadirContacto(c));
        assertTrue(agenda.buscarContacto("Ana", "Lopez").isPresent());
    }

Evaluación según rúbrica

Estructura (30 pts): Clases bien definidas, menú por consola.

Funcionalidad (40 pts): Métodos implementados correctamente.

Calidad del código (30 pts): Buen uso de OOP, CamelCase, comentarios claros.

Presentación: Recurso visual (PPT o video), comunicación clara.

Ejecución

Clonar el repositorio:

git clone https://github.com/usuario/agenda-contactos-java.git

Compilar y ejecutar:

    cd agenda-contactos-java
    javac src/main/java/*.java
    java Main

Autores

Proyecto desarrollado por estudiantes como parte del Hackathon 2.

Licencia

Este proyecto se distribuye bajo la licencia MIT
