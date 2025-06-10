# 📦 Inventario Tibu 

Este proyecto es un sistema de gestión de inventario desarrollado con **Spring Boot**, diseñado para llevar el control de productos y usuarios de manera eficiente mediante operaciones CRUD conectadas a una base de datos relacional.

---

## 🎯 Objetivo

Gestionar los productos disponibles y los usuarios encargados del sistema, permitiendo registrar, actualizar, listar y eliminar información desde una API RESTful.

---

## 🧰 Tecnologías utilizadas

- ☕ Java 17
- ⚙️ Spring Boot
- 🌐 Spring Web
- 🧬 Spring Data JPA
- 🐬 MySQL
- 🔧 Maven
- 📩 Postman (para pruebas de endpoints)
- 🖥️ IDE recomendado: IntelliJ IDEA o VS Code

---

## 📁 Estructura del proyecto

```plaintext
└── src
    └── main
        └── java
            └── com.inventario.tibu
                ├── controller     # Controladores REST (Producto y Usuario)
                ├── model          # Entidades Producto y Usuario
                ├── repository     # Interfaces JPA
                └── service        # Servicios (lógica de negocio)
