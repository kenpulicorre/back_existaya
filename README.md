inicio de readme desde vi

# Individual Project - Java Backend

## Objetivos del Proyecto

Descripción de la prueba

La empresa Company PARAMETA desea realizar un programa que le permita el registro de sus empleados y una posterior validacion de informacion, todo esto desde un back java con metodo post.

detalle:

Implementar en Java un servicio Rest que reciba como parámetros los atributos del objeto
empleado (que será descrito más adelante) al ser invocado mediante el método POST.
El servicio deberá validar los formatos de las fechas y que los atributos no vengan vacíos,
adicionalmente deberá validar que el empleado sea mayor de edad. Una vez se hayan
superado estas validaciones se deberá almacenar la información en una base de datos mysql.
El Servicio Web responderá con el objeto en estructura JSON, en el que se deberá adicionar la
siguiente información:

- Tiempo de Vinculación a la compañía (años, meses
- Edad actual del empleado (años, meses y días)

Atributos del objeto empleado:

- Nombres (String)
- Apellidos (String)
- Tipo de Documento (String)
- Número de Documento (String)
- Fecha de Nacimiento (Date)
- Fecha de Vinculación a la Compañía (Date)
- Cargo (String)
- Salario (Double)

Requerimientos del programa

- Registro de clientes (nombres, cedula, celular, dirección, ciudad).
- La ciudad debe tener asociado un departamento
- Creación de API mediante Laravel y consumirlo con React
- El agente se crea previamente en la tabla MySql (cédula agente, nombre)
- Asignación de agente (un proceso simple donde se asigna el agente al cliente) mediante React
- Listar los clientes con su respectivo agente en React
- Las acciones del CRUD para los agentes y clientes, se deben hacer mediante React
- Se debe usar Laravel.
- Sistema de autenticación y registro mediante React

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
http://localhost:8080/empleados

```

## Documentacion postman

La idea general es crear una aplicación en la cual se puedan hacer peticiones http, por lo mismo se utiliza postman para ello: [postman](https://documenter.getpostman.com/view/19592464/UzQvtQt6)

## Archivo back:

[link de back](https://github.com/kenpulicorre/laravel_CRUD)

```

php artisan serve

```

si aun no tiene las tablas actualizadas puede ejecutar:

```

php artisan migrate:fresh

```

y una vez se tengan ejecutando el back puede ir al front o al postman para que inicie las pruebas.

## Archivo front:

[link de front](https://github.com/kenpulicorre/laravel_front)

para ejecutar el archivo front, solo debe de dirijirse a la carpeta `cliente` y dijitar

```

npm install

```

y una vez se tengan instaladas las dependencias ejecutar la aplicacion,

```

npm start

```

```

```
