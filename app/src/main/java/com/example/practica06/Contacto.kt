package com.example.practica06

data class Contacto(
    val nombre: String,
    val telefono: String,
    val correo: String
)

fun obtenerContactos(): List<Contacto> {
    return listOf(
        Contacto("Ana López", "6671234567", "ana@gmail.com"),
        Contacto("Carlos Pérez", "6672345678", "carlos@gmail.com"),
        Contacto("María García", "6673456789", "maria@gmail.com"),
        Contacto("José Ramírez", "6674567890", "jose@gmail.com"),
        Contacto("Laura López", "6675678901", "laura@gmail.com"),
        Contacto("Miguel Torres", "6676789012", "miguel@gmail.com"),
        Contacto("Sofía Hernández", "6677890123", "sofia@gmail.com"),
        Contacto("Diego Flores", "6678901234", "diego@gmail.com"),
        Contacto("Valeria Cruz", "6679012345", "valeria@gmail.com"),
        Contacto("Andrés Morales", "6670123456", "andres@gmail.com"),
        Contacto("Fernanda Ruiz", "6671122334", "fernanda@gmail.com"),
        Contacto("Daniel Castro", "6672233445", "daniel@gmail.com")
    )
}