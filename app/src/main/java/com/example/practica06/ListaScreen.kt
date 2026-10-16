package com.example.practica06

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
@Composable

fun ListaScreen() {

    val context = LocalContext.current
    val contactos = obtenerContactos()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Lista de contactos")
                }
            )
        }
    ) { padding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(contactos) { contacto ->

                ContactoItem(
                    contacto = contacto,
                    onClick = {
                        Toast.makeText(
                            context,
                            "Seleccionaste a ${contacto.nombre}",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                )
            }
        }
    }
}

@Composable
fun ContactoItem(
    contacto: Contacto,
    onClick: () -> Unit
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Text(
                text = contacto.nombre,
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = "Teléfono: ${contacto.telefono}",
                style = MaterialTheme.typography.bodyMedium
            )

            Text(
                text = "Correo: ${contacto.correo}",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}