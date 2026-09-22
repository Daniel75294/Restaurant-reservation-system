# Sistema de Gestión de Reservas para Restaurante

Aplicación de consola desarrollada en **Java** para gestionar reservas de mesas en un restaurante.

## Descripción

El sistema permite registrar clientes y crear reservas indicando la fecha y hora. Al realizar una reserva, el sistema asigna automáticamente una mesa disponible.

Proyecto desarrollado individualmente como parte de la asignatura **Programación 2** en la Universidad de Las Américas (UDLA).

## Funcionalidades

- Registro de clientes.
- Registro de reservas.
- Asignación automática de mesas disponibles.
- Consulta de reservas registradas.
- Ingreso de fecha y hora mediante `LocalDateTime`.
- Validación del formato de fecha y hora.

## Tecnologías

- Java
- Programación Orientada a Objetos (POO)
- `ArrayList`
- `LocalDateTime`
- Java Collections Framework

## Estructura del proyecto

- `Main.java` — Menú principal e interacción con el usuario.
- `Cliente.java` — Representa la información del cliente.
- `Mesa.java` — Representa las mesas y su disponibilidad.
- `Reserva.java` — Representa una reserva.
- `ControladorReserva.java` — Gestiona las reservas y la asignación de mesas.

## Ejecución

1. Descargar o clonar el repositorio.
2. Abrir el proyecto en un IDE compatible con Java.
3. Ejecutar `Main.java`.
4. Utilizar el menú de la aplicación para registrar y consultar reservas.

## Autor

**Daniel Sánchez**

Proyecto universitario — Programación 2, UDLA.
