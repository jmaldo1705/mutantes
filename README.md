# Mutantes

_Aplicación para validar mutantes_

## Comenzando 🚀

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._

Mira **Despliegue** para conocer como desplegar el proyecto.


### Pre-requisitos 📋

_Para una ejecución en a,biente local se requiere mínimo Java 8 y como IDE Intellij, relaciono versión en la que se desarrolló_

```
java version "1.8.0_291"
Java(TM) SE Runtime Environment (build 1.8.0_291-b10)
Java HotSpot(TM) Client VM (build 25.291-b10, mixed mode)
```

### Instalación 🔧

_Descargar las dependencias Maven, se utiliza una base de datos H2 (En memoria) y sus credenciales son usuario: sa  contraseña: pass_

```
spring.datasource.url=jdbc:h2:mem:mutantesdb
spring.datasource.username=sa
spring.datasource.password=pass
```

_La URL para acceder a la base de datos en memoria es la siguiente:_

```
http://localhost:8080/h2-console
```


## Ejecutando las pruebas ⚙️

_Las pruebas se realizaron con Junit 5 y Mockito, el coverage se puede validar ejecutando la opción Run 'All Test' with Coverage en el caso de Intellij_


## Despliegue 📦

_Para este caso se genera un jar, para pruebas locales se puede ejecutar la clase Main EncuestaApplication_
_Las pruebas de los servicios se pueden realizar directamente en postman, las url para consumir los servicios son las siguientes:_
```
POST
localhost:8080/prueba/mutant

GET
localhost:8080/prueba/stats
```
## Construido con 🛠️

_Este proyecto fue realizado con las siguientes herramientas_

* [Intellij](https://www.jetbrains.com/es-es/idea/download/) - IDE de desarrollo
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Spring Initializr](https://start.spring.io/) - Usado para generar el código base

## Autor ✒️

* **Jonathan Maldonado** - *Desarrollo* - [jmaldonado1705@gmail.com](mailto:jmaldonado1705@gmail.com)
