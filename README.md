# Práctica 4 - Gestión de Usuarios con Spring Boot

**Autor:** Ismael Cornejo

Este repositorio contiene la Práctica 4, desarrollada utilizando **Spring Boot**. El objetivo principal de este proyecto es demostrar la creación e inicialización de un proyecto web mediante *Spring Initializr*, así como la implementación y uso de diferentes tipos de controladores.

## 🚀 Tecnologías Utilizadas
- **Java**
- **Spring Boot** (Spring Web)
- **Thymeleaf** (para renderizado de vistas)
- **Maven** (gestión de dependencias)

## 📋 Funcionalidades Principales

El proyecto expone la información de un modelo de Usuario mediante dos enfoques distintos:

1. **Uso de Controllers (MVC Tradicional):** 
   - **Ruta:** `http://localhost:8080/gestionUsuarios`
   - **Descripción:** Un controlador estándar de Spring MVC (`@Controller`) que envía los datos del usuario a una vista HTML para ser renderizados y presentados visualmente al cliente.

2. **Uso de Rest Controllers (API REST):**
   - **Ruta:** `http://localhost:8080/api/v1/usuarios`
   - **Descripción:** Un controlador RESTful (`@RestController`) que expone los datos del usuario directamente estructurados en formato **JSON**.

## 🛠️ Instrucciones de Ejecución
1. Clonar este repositorio localmente.
2. Abrir el proyecto en **Eclipse** (o cualquier IDE de su preferencia) como un *Existing Maven Project*.
3. Ejecutar el proyecto como una aplicación Spring Boot.
4. Navegar a las rutas indicadas en su explorador web preferido para visualizar los resultados.
