# API Rest - Inventario de productos 

API REST completa para gestionar el inventario de una tienda, construida en Spring Boot, Gradle, Postgres y dockerizada

## Tecnologías
- Spring Boot 4.0.5
- Gradle 
- PostgresSQL
- JPA - hibernate
- Docker, Docker compose

## Cómo ejecutar localmente

```bash
# 1. Clonar el repositorio
git clone 

# 2. Entrar a la carpeta inventario
cd inventario

# 3. Ejecutar con Docker Compose 
docker compose up --build
```
## Endpoints
| Método | Endpoint | Descripción |
| ------ | -------- | ----------- |
| GET    | /productos | Lista de productos |
| GET    | /productos/{id} | Producto especifico |
| POST   | /productos | Crear producto |
| PUT    | /productos/{id} | Modificar producto |
| DELETE | /productos/{id} | Eliminar producto |


## Descripción de la base de datos
La base de datos se crea automáticamente al iniciar el contenedor de docker-compose, y se borra al pararlo.

Base de datos: PostgreSQL (puerto 5433)
