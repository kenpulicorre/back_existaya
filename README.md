inicio de readme desde vi

# Individual Project - Java Backend

## Objetivos del Proyecto

## Descripción de la prueba

La empresa Existaya desea realizar un programa que le permita el registro votos en heroes de television y una ilustracion llevada hasta el backend

Requerimientos del programa

## Requisitos:

Interacción - JS
Utilice un framework que permita ayudar en la creación de interfaces adaptables en diferentes dispositivos web con CSS y JavaScript, tales como Bootstrap / Foundation / Materialize.
Utilice fuentes de proveedores como lo es Google Font.
Utilice su propia fuente de iconos.
Idóneo utilizar preprocesadores como LESS / SASS o cualquier tipo de marco CSS si lo desea. (Si prefiere utilizar CSS puro también es una opción, pero debe argumentar los beneficios)
En responsive plante la visual y su diagramación.

Solo agregue interacción en el banner principal referente a la votación.

## Requerimientos:

Cree una fuente de datos en formato JSON con la estructura que mejor se adapte al contenido de las casillas de votación y complete el contenido inicial a partir de ella.
El usuario puede seleccionar el botón "me gusta" o " no me gusta" en la card del banner principal. Ideal plantear un estado para el botón Me gusta o no Me gusta y que el usuario perciba la microinteración.
Una vez que el usuario hace clic en el botón "Votar ahora", se muestra un mensaje que dice "Tu voto ha sido registrado!" así como un botón de votar de nuevo que vuelve a traer la card inicial.
No hay límite en la cantidad de votos.
Las barras de porcentaje deben cambiar dependiendo de los votos positivos o negativos.
Piense en una forma de conservar los votos actuales para que, si se actualiza la página, los datos no se pierdan. (podría ser local en el navegador o en el servidor si tiene esas habilidades).
Queremos conocer sus habilidades del DOM JS, así que no use jQuery.
Puede resolver esta parte con JS y algunos patrones, o el ideal Angular > v4 como framework. Utilice el que le resulte más cómodo.
Entrega:
Muéstrenos un vistazo de lo que le encanta hacer (y de lo que conoce mejor).
Escriba en un archivo readme.md para hacer referencia a cualquier aspecto clave que desee mencionar sobre lo que aplicó en el ejercicio y / o cualquier otra información relevante sobre los pasos para poner en marcha el proyecto.
Envíe un enlace apuntando a su repositorio (Github, Bitbucket) que incluye el recurso. La rama maestra debe contener todo el ejercicio.

## antes de iniciar

El proyecto se realiza en java y el software netbeans.
**version JDK:**

```
openjdk 11.0.15 2022-04-19 LTS
OpenJDK Runtime Environment Corretto-11.0.15.9.1 (build 11.0.15+9-LTS)
OpenJDK 64-Bit Server VM Corretto-11.0.15.9.1 (build 11.0.15+9-LTS, mixed mode)

nota: Corretto-11.0.15.9.1 , se utiliza para futuros despliegues aws
```

## Comienza

1.  Forkear o clonar el repositorio para poder ejecutarlo desde tu terminal

Tendrán un `boilerplate` con la estructura general del servidor (hecho en java)

 <!-- como de cliente(react.js) -->

**IMPORTANTE:** se requiere que tenga intalado `jdk`, es importante que verifique si tiene eln el arcivo `pom.xml` la version que esta descargada para evitar problemas para nuestro caso version 11:

```
<properties>
		<java.version>11</java.version>
	</properties>
```

por otro lado la configuracion de base de datos se debe de realizar de la sigueinte manera:
se debe de dirijir a la carpeta descargada y mirar el archivo `application.properties`:

```
pruevaParameta\src\main\resources\application.properties

```

Verifique que la base de daos tenga la base de datos creada por usted:

- `spring.jpa.database=postgresql` es el nombre del motor de base a utilizar
- `spring.jpa.hibernate.ddl-auto=update` //para produccion dejarlo en `none` y para crear `create`
- `spring.datasource.url=jdbc:postgresql: //localhost:5432/prueba_java`
  donde: **`- prueba_java`**: es el nombre de la base de datos creada
- `spring.datasource.username=postgres ` **postgres** es nombre del usuario de base de datos
- `spring.datasource.password=12345` donde `12345` es la contraseña de la base de datos

**para postgresql**

```
spring.jpa.database=postgresql
spring.jpa.show-sql=false
spring.jpa.hibernate.ddl-auto=create
spring.datasource.driver-class-name=org.postgresql.Driver
#spring.datasource.url=jdbc:postgresql://localhost:5432/prueba_java
spring.datasource.url=jdbc:postgresql://localhost/prueba_java
spring.datasource.username=postgres
spring.datasource.password=12345


```

**para MySQL**

- `localhost`: se puede reemplazar por la direccion ip que usted disponga.

- `5432`:es el puerto que usted disponga.

- `prueba_java`: es el nombre de la base de datos creada

```

spring.datasource.url=jdbc:mysql://localhost:5432/prueba_java
spring.datasource.username=mysql
spring.datasource.password=12345
spring.jpa.hibernate.ddl-auto=update


```

#

## Ejecucion del proyecto

usar mvn para ejecutar y posicionate desde la carpeta `pruevaParameta` o resulta mas facil ejecutarlo desde algun programa ejecutor java, como `netBeans` el cual se utilizo para esta practica especificamente

- Windows 10 ejecucion:

```
mvnw.cmd spring-boot:run

```

Unix based:

```

mvwn spring-boot:run

```

y para entrar a la ejecucion puede ejecutar: abre el navegador de tu preferencia (se recomienda chrome) y ejecuta

```
http://localhost:8080/movie

```

## Documentacion postman

La idea general es crear una aplicación en la cual se puedan hacer peticiones http, por lo mismo se utiliza postman para ello: [postman](https://documenter.getpostman.com/view/19592464/UzQxLibs)

## Archivo back:

[link de back](https://github.com/kenpulicorre/back_existaya)

## Archivo Front:

[link de back](https://github.com/kenpulicorre/front_parameta)
