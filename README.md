# AluraLibros

# Catálogo de Libros y Autores con la API "Gutendex"

Este proyecto tiene como objetivo construir un catálogo de libros y autores utilizando la API gratuita "Gutendex", que ofrece acceso a más de 70,000 libros de la biblioteca en línea gratuita conocida como Proyecto Gutenberg. La API proporciona información relevante como el título, los autores, idiomas, formato del texto y cantidad de descargas de los libros.

En esta etapa del desafío, implementaremos una aplicación que interactúa con el usuario, permitiendo realizar consultas de libros, listar libros por idioma, obtener información sobre los autores, y consultar autores vivos en un determinado año. Además, utilizaremos una base de datos PostgreSQL para almacenar los libros y autores, y realizaremos consultas estadísticas sobre los mismos.

## Funcionalidades

### 1. **Búsqueda de libro por título**
   - El usuario podrá buscar un libro ingresando su título. La aplicación hará una consulta a la API "Gutendex" y mostrará los siguientes datos del primer resultado:
     - Título
     - Autor
     - Idioma
     - Número de descargas

### 2. **Lista de todos los libros**
   - Todos los libros que el usuario haya buscado se almacenarán en un listado para que el usuario pueda verlos en cualquier momento.

### 3. **Lista de autores**
   - Los autores de los libros buscados también se guardarán, y el usuario podrá ver un listado con todos los autores.

### 4. **Listar autores vivos en un determinado año**
   - El usuario podrá consultar qué autores estaban vivos en un año específico, utilizando la fecha de nacimiento y fallecimiento de los autores.

### 5. **Exhibir cantidad de libros en un determinado idioma**
   - La aplicación permitirá consultar la cantidad de libros de un idioma específico almacenados en la base de datos.

### 6. **Base de datos PostgreSQL**
   - Los datos de libros y autores se guardarán en una base de datos PostgreSQL utilizando Spring Data JPA.
   - Se establecerá una relación entre los libros y sus autores, de manera que cada libro tenga asociado un autor.

## Estructura del Proyecto

### Clases principales:

- **Libro**: Clase entidad que representa un libro, con los siguientes atributos:
  - `Título`
  - `Autor`
  - `Idioma`
  - `Número de descargas`
  
- **Autor**: Clase entidad que representa un autor, con los siguientes atributos:
  - `Nombre`
  - `Año de nacimiento`
  - `Año de fallecimiento`

### Repositorios:

- **LibroRepository**: Repositorio de Spring Data JPA para manejar la inserción y consulta de libros en la base de datos.
  
- **AutorRepository**: Repositorio de Spring Data JPA para manejar la inserción y consulta de autores en la base de datos.

### Consultas derivadas:

- Consulta para obtener el número de libros por idioma.
- Consulta para listar autores vivos en un año específico.

## Instalación y Uso 🚀

### Pre-requisitos 📋

- **Conexión a internet**
- **Navegador web compatible** (Chrome, Firefox, etc.)
- **Editor de código** como INTELLIJIDEA , VSCode o cualquier otro editor Java compatible.
- **JDK 17** o superior.
- **PostgreSQL** instalado y en funcionamiento.

### Instalación 🔧

1. **Clona el repositorio**:
   ```
   git clone https://github.com/mauriander/litteralura   
   ```

2. **Configura la base de datos PostgreSQL**:
   - Crea una base de datos llamada `catalogo_libros` en PostgreSQL.
   - Actualiza el archivo `application.properties` con las credenciales de tu base de datos.

3. **Compila y ejecuta la aplicación**:
   - Abre el proyecto en tu editor de código.
   - Ejecuta el proyecto con `Spring Boot` para iniciar la aplicación.

4. **Interacción con el usuario**:
   - La aplicación se ejecuta en la consola, donde el usuario podrá elegir entre las siguientes opciones:
     1. Buscar un libro por título.
     2. Ver la lista de libros buscados.
     3. Ver la lista de autores.
     4. Consultar autores vivos en un año específico.
     5. Consultar la cantidad de libros en un idioma específico.

### Ejemplo de Uso

1. **Buscar un libro**:  
   El usuario ingresa el título de un libro y la aplicación muestra los datos correspondientes (título, autor, idioma, y número de descargas).

2. **Ver listado de libros**:  
   El usuario puede ver un listado de los libros que ha buscado previamente.

3. **Listar autores**:  
   El usuario puede ver una lista de los autores de los libros que han sido buscados.

4. **Consultar autores vivos**:  
   El usuario ingresa un año y la aplicación le muestra los autores vivos en ese año según los datos de nacimiento y fallecimiento.

5. **Estadísticas por idioma**:  
   El usuario puede consultar cuántos libros existen en un idioma específico dentro de la base de datos.

## Desarrollo y Consideraciones

### Entidades y Relaciones

- **Relación entre Libro y Autor**: Cada libro está relacionado con un solo autor, y cada autor puede tener múltiples libros.
- **Base de Datos**: Usamos PostgreSQL para almacenar la información de los libros y los autores. Para cada libro, se almacena su título, idioma, número de descargas y su autor asociado.

### Consultas Derivadas

- **Número de libros por idioma**: Utilizamos las *derived queries* de Spring Data JPA para contar cuántos libros están escritos en un idioma determinado.
- **Autores vivos**: Creamos una consulta para obtener los autores que estaban vivos en un año específico.

### Pruebas

Realiza pruebas exhaustivas para asegurar que todas las funcionalidades de la aplicación trabajen correctamente. Algunas pruebas incluyen:
- Probar la búsqueda de libros con diferentes títulos.
- Verificar que los autores se muestren correctamente.
- Comprobar la funcionalidad de las consultas por idioma y por autores vivos.


## Autores ✒️

* **Mauricio Andermatten** - *Challenge ALURALIBROS* - [mauriander](https://github.com/mauriander)
