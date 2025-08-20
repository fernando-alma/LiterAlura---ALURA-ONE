# LiterAlura---ALURA-ONE
Objetivos del challenge: Desarrollar un Catálogo de Libros que ofrezca interacción textual (vía consola) con los usuarios, proporcionando al menos 5 opciones de interacción.


![Portada](src/assets/LiterAlura.png)

***LiterAlura - Versión 1.0***

## Descripción General

LiterAlura es una aplicación desarrollada en Java con Spring Boot que permite explorar y buscar información sobre libros y autores utilizando la API de Gutendex.
Esta es la primera versión del proyecto, enfocada en la lógica central de consumo de API y gestión de datos, estableciendo la base para un proyecto fullstack completo en el futuro.
---

##  Estructura del Proyecto

```plaintext
LiterAlura - ALURA ONE/
│
├── .idea/                             # Archivos de configuración del IDE
├── .mvn/                              # Configuración de Maven
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/alura/literalura/
│   │   │       ├── dto/               # Data Transfer Objects para API
│   │   │       │   ├── AutorDTO.java
│   │   │       │   ├── LibroDTO.java
│   │   │       │   └── ResultadosDTO.java
│   │   │       ├── model/             # Modelos de dominio
│   │   │       │   ├── Autor.java
│   │   │       │   └── Libro.java
│   │   │       ├── principal/         # Clase principal para ejecución
│   │   │       │   └── Menu.java
│   │   │       ├── repository/        # Interfaces de repositorio
│   │   │       │   ├── IAutorRepository.java
│   │   │       │   └── ILibroRepository.java
│   │   │       └── service/           # Lógica de negocio y consumo de API
│   │   │           ├── AutorService.java
│   │   │           ├── ConsumoAPI.java
│   │   │           ├── ConversorDatos.java
│   │   │           ├── IConversorDatos.java
│   │   │           └── LibroService.java
│   │   └── resources/
│   │       └── application.properties # Configuración de la aplicación
│   └── test/
│       └── java/com/alura/literalura/
│           └── LiteraluraApplicationTests.java
├── target/                             # Archivos compilados y build
├── .gitignore                          # Archivos y carpetas ignoradas en Git
├── HELP.md                             
├── mvnw / mvnw.cmd                      # Wrapper de Maven
└── LiterAluraApplication.java           # Clase principal de Spring Boot
                     
````

---

##  Características Principales (v1.0)

| Funcionalidad                                 | Estado        |
|----------------------------------------------|---------------|
| Buscar libros por título o autor             | ✔️            |
| Listar libros registrados                    | ✔️            |
| Listar autores registrados                   | ✔️            |
| Filtrar autores vivos en un año específico   | ✔️            |
| Filtrar libros por idioma                    | ✔️            |
| Persistencia en base de datos PostgreSQL     |  ✔️           |
| Interfaz gráfica (GUI)                       | ❌ No iniciado |
| Arquitectura fullstack                       | ❌ No iniciado |

---

##  Tecnologías Utilizadas

- Java 21+
- Spring Boot y Spring Data
- Jackson Databind para manejo de JSON
- JPA/Hibernate para persistencia de datos
- PostgreSQL como base de datos
- IDE: IntelliJ IDEA (u otro compatible con Java)
- API: Gutendex para información de libros y autores

---

##  Uso


1. **Clonar el repositorio:**

```bash

  git clone https://github.com/fernando-alma/LiterAlura---ALURA-ONE.git

```

2. **Configurar variables de entorno:**

```

DB_HOST=localhost:5432
DB_NAME=literalura
DB_USER=tu_usuario
DB_PASSWORD=tu_password

```
   


3. **Ejecutar la aplicación (desde IntelliJ o terminal):**


```bash

 ./mvnw spring-boot:run

```

4. **Pasos para usar el programa:**

- Seleccionar la opción deseada en el menú.
- Ingresar los datos requeridos (título, autor, año o idioma).
- Visualizar los resultados en consola.
- Repetir o salir del programa.


##  Licencia

Este proyecto es para uso personal y educativo.

---

##  Autor

**Alma Dileo Fernando Gonzalo**
Desarrollador Fullstack.

Contacto: \  [LinkedIn](https://www.linkedin.com/in/fernando-alma/) | [GitHub](https://github.com/fernando-alma)

---





