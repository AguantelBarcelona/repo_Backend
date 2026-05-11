#  Backend Microservice – Innovatech Chile

##  Descripción del proyecto

Este repositorio contiene el microservicio backend del sistema DevOps desarrollado para Innovatech Chile.

El backend está construido con **Spring Boot** y expone una API REST encargada de gestionar la lógica de negocio del sistema.  
El proyecto sigue una arquitectura basada en microservicios, contenedores y automatización CI/CD, garantizando portabilidad, escalabilidad y despliegue continuo.

---

## Objetivo

- Exponer una API REST funcional  
- Integrarse con el frontend del sistema  
- Ejecutarse en entornos contenerizados  
- Desplegarse automáticamente en AWS EC2 mediante CI/CD  

---

##  Tecnologías utilizadas

- Java 17  
- Spring Boot  
- Maven  
- Docker  
- Docker Compose  
- GitHub Actions  
- AWS EC2  

---

##  Arquitectura del sistema

El sistema sigue una arquitectura de microservicios:

Frontend → Backend → Base de Datos  

El backend actúa como capa central de procesamiento, gestionando solicitudes HTTP y respondiendo a las peticiones del frontend.

---

## Estructura del proyecto

```plaintext
src/
├── main/
│   ├── java/
│   │   └── com/innovatech/backend/
│   │       ├── controller/
│   │       │   └── HealthController.java
│   │       └── BackendApplication.java
│   └── resources/
│       └── application.properties
│
└── test/
    └── java/
        └── com/innovatech/backend/
            └── BackendApplicationTests.java

Dockerfile
pom.xml
mvnw
mvnw.cmd
.gitignore
.gitattributes
```



---

##  Contenedorización

El backend está contenerizado mediante Docker, permitiendo su ejecución en cualquier entorno sin depender del sistema operativo host.

Incluye:

- Dockerfile optimizado  
- Variables de entorno  
- Exposición del puerto del servicio  

---

##  CI/CD (GitHub Actions)

Se implementa un pipeline de integración y despliegue continuo que:

- Construye la imagen Docker del backend  
- Publica la imagen en Docker Hub o AWS ECR  
- Despliega automáticamente en AWS EC2  
- Se activa mediante push en la rama `deploy`  

Se utilizan **GitHub Secrets** para almacenar credenciales sensibles como tokens y claves SSH, evitando su exposición en el repositorio.

---

##  Despliegue en AWS EC2

El backend se ejecuta en una instancia EC2 con Ubuntu.

El despliegue se realiza mediante Docker Compose, asegurando consistencia entre entornos de desarrollo y producción.

---

##  Endpoint de prueba

Permite verificar que el servicio backend está funcionando correctamente.

**Método:** GET  
**Endpoint:** `/health`  
**Respuesta esperada:** Servicio activo (OK / 200)

---

##  Estado del proyecto

✔ Backend funcional  
✔ API REST operativa  
✔ Contenerización con Docker  
✔ CI/CD implementado  
✔ Despliegue en AWS EC2  

---

##  Autor

Proyecto desarrollado como parte de la evaluación **DevOps – Innovatech Chile**
