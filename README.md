README.txt
===========

Conjunto de Proyectos Full Stack - Java / Spring Boot / React / MySQL / JWT
----------------------------------------------------------------------------

Descripción General:
--------------------
Este repositorio contiene un conjunto de proyectos **full stack** desarrollados con tecnologías modernas tanto en el backend como en el frontend. El backend está construido con Java y Spring Boot, utilizando Maven y MySQL como base de datos, junto con JWT para autenticación. El frontend está desarrollado con React, conectándose a las APIs REST creadas en los distintos backends.

Todos los proyectos están organizados por carpetas dentro del mismo repositorio y son gestionados con Git.

Tecnologías Utilizadas:
------------------------
Backend:
- Java 17+
- Spring Boot 3.x
- Maven
- MySQL 8.x
- JWT (Json Web Token)

Frontend:
- React 18+
- HTML5, CSS3, JavaScript (ES6+)
- Axios / Fetch API
- Bootstrap o TailwindCSS (según proyecto)

Repositorio:
- Git (control de versiones)

Requisitos Previos:
-------------------
- Java JDK 17+
- Node.js 18+ y npm o yarn
- Maven 3.x
- Servidor MySQL
- Navegador moderno
- IDEs recomendados: IntelliJ IDEA (backend) y VS Code (frontend)

Cómo Ejecutar un Proyecto:
--------------------------
1. Clonar el repositorio:
   git clone https://github.com/torrescampi/proyectos.git

2. Entrar a la carpeta deseada (por ejemplo, usuarios):
   cd usuarios/backend

3. Configurar el backend en `application.properties`:

spring.datasource.url=jdbc:mysql://localhost:3306/mi_base
spring.datasource.username=usuario
spring.datasource.password=clave

4. Ejecutar backend:
mvn spring-boot:run

5. Abrir el frontend:
cd ../frontend

6. Instalar dependencias:
npm install

7. Ejecutar frontend:
npm start

Autenticación con JWT:
----------------------
- Endpoint de login (backend): POST /auth/login
- El token JWT debe enviarse en todas las peticiones protegidas mediante:
Authorization: Bearer <token>
- El frontend maneja la autenticación y el almacenamiento del token de forma segura (localStorage o cookies según el proyecto).

Autor:
------
Estanislao Torres Campi  
Desarrollador Full Stack  
Contacto: estanislaotorres@gmail.com (opcional)

Licencia:
---------

