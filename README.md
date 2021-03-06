# Mutantes

_Aplicaci贸n para validar mutantes_

## Comenzando 馃殌

_Estas instrucciones te permitir谩n obtener una copia del proyecto en funcionamiento en tu m谩quina local para prop贸sitos de desarrollo y pruebas._

Mira **Despliegue** para conocer como desplegar el proyecto.


### Pre-requisitos 馃搵

_Para una ejecuci贸n en ambiente local se requiere m铆nimo Java 8, relaciono versi贸n en la que se encuentra desplegado_

```
Corretto 11 running on 64bit
Amazon Linux 2/3.2.1
```

### Instalaci贸n 馃敡

_Descargar las dependencias Maven, se utiliza una base de datos H2 (En memoria) y sus credenciales son usuario: sa  contrase帽a: pass_

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


## Ejecutando las pruebas 鈿欙笍

_Las pruebas se realizaron con Junit 5 y Mockito, el coverage se puede validar ejecutando la opci贸n Run 'All Test' with Coverage en el caso de Intellij_


## Despliegue 馃摝

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
_Para ambiente local ser铆an los siguientes datos:_
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
## Construido con 馃洜锔?

_Este proyecto fue realizado con las siguientes herramientas_

* [Intellij](https://www.jetbrains.com/es-es/idea/download/) - IDE de desarrollo
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Spring Initializr](https://start.spring.io/) - Usado para generar el c贸digo base

## Autor 鉁掞笍

* **Jonathan Maldonado** - *Desarrollo* - [jmaldonado1705@gmail.com](mailto:jmaldonado1705@gmail.com)
