# Mutantes

_Aplicación para validar mutantes_

## Comenzando 🚀

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._

Mira **Despliegue** para conocer como desplegar el proyecto.


### Pre-requisitos 📋

_Para una ejecución en ambiente local se requiere mínimo Java 8, relaciono versión en la que se encuentra desplegado_

```
Corretto 11 running on 64bit
Amazon Linux 2/3.2.1
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
Amazon:
http://ec2-18-223-171-159.us-east-2.compute.amazonaws.com:8080/h2-console/
Local:
http://localhost:8080/h2-console
```


## Ejecutando las pruebas ⚙️

_Las pruebas se realizaron con Junit 5 y Mockito, el coverage se puede validar ejecutando la opción Run 'All Test' with Coverage en el caso de Intellij_


## Despliegue 📦

_Para este caso se genera un jar, para pruebas locales se puede ejecutar la clase Main EncuestaApplication_
_Las pruebas de los servicios se pueden realizar directamente en postman, las url para consumir los servicios son las siguientes:_
```
POST
http://ec2-18-223-171-159.us-east-2.compute.amazonaws.com:8080/prueba/mutant
Body:
{
"dna":["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]
}

GET
http://ec2-18-223-171-159.us-east-2.compute.amazonaws.com:8080/prueba/stats
```
_Para ambiente local serían los siguientes datos:_
```
POST
http://localhost:8080/prueba/mutant
Body:
{
"dna":["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]
}

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
