# Foro Hub - Challenge - Back End

Se creo una API REST con Spring para este desafio llamado Foro Hub.

Esta API permite crear un nuevo tópico, mostrar todos los tópicos creados,
mostrar un tópico específico, actualizar un tópico y Eliminar un tópico.

Esta API tiene que llevar a cabo funciones que realizara validando las
reglas de negocio y siguiendo las mejores practicas del modelo REST, 
asi como la implementacion de una base de datos y el servicio de 
autenticacion para restringir el acceso a la informacion.

Se realizo el repositorio del proyecto en GitHub y se utiliza el README
para detallar funciones del sistema.

La application.properties se configuro con los datos de la URL,
nombre de usuario y contraseña, asi como la base de datos, utilizando
PostgreSQL para conectar la base de datos y asi almacenar la información
de la aplicación, ademas se utilizaron las variables de entorno para no
mostrar informacion sensible en el proyecto, tambien para integrar la base
de datos al proyecto Spring, se agregaron algunas dependencias en el pom.xml

Se realizaron migraciones para la construccion de tablas con extension sql.

Para la persistencia de datos se utilizo @PostMapping y @Transactional.

La API cuenta con un endpoint para aceptar solicitudes del tipo POST y 
los datos del tópico se envian al cuerpo de la solicitud en formato JSON,
tambien se utilizo la anotación @RequestBody para recibir correctamente los datos.

El topico se guarda en la base de datos, para validar datos se utilzo Spring @Valid

Se utilizo la anotación @PathVariable para recibir el campo de ID de la 
solicitud GET, para actualizacion de datos acepta solicitudes del tipo PUT,
se utiliza el método isPresent() de la clase Java llamada Optional.

Para la eliminación de un tópico específico acepta solicitudes del tipo
DELETE. 

Se utilizo insomnia para pruebas.



