# Proyecto de Gestión de Proveedores

Este es un proyecto de ejemplo para gestionar proveedores utilizando Spring Boot. El objetivo del proyecto es
proporcionar una API RESTful para manejar información de proveedores asociados a diferentes clientes.

## Requisitos previos

Antes de comenzar, asegúrate de tener los siguientes requisitos instalados en tu máquina:

- [Java 17 o superior](https://www.oracle.com/es/java/technologies/downloads/)
- [Maven](https://maven.apache.org/)
- [IDE recomendado: IntelliJ IDEA](https://www.jetbrains.com/idea/)

## Construir y Ejecutar la Aplicación

Si usas Maven, ejecuta los siguientes comandos para construir y ejecutar el proyecto:

### Construcción del proyecto

```bash
  mvn clean install
```

### Ejecutar la aplicación:

```bash
  mvn spring-boot:run
```

## Probando la aplicación

Una vez que la aplicación esté en funcionamiento, podrás realizar solicitudes a la API usando herramientas como Postman.

Por ejemplo, para obtener los proveedores de un cliente, puedes realizar una solicitud GET a la siguiente URL:

```http
  GET http://localhost:8080/suppliers/{idClient}
```

| Parameter  | Type      | Description                          |
|:-----------|:----------|:-------------------------------------|
| `idClient` | `Integer` | Id del cliente asociado al proveedor |

## Pruebas Unitarias

Este proyecto utiliza JUnit y Spring Boot Test para realizar pruebas unitarias.

Puedes ejecutar las pruebas utilizando los siguientes comandos:

```bash
  mvn test
```

Los resultados de las pruebas se generarán en la consola. Asegúrate de que todos los tests pasen correctamente antes de
realizar implementaciones más complejas.