package com.example.portfolio_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

class ContactActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContactScreen()
        }
    }
}

@Composable
fun ContactScreen() {
    val message = remember { mutableStateOf("") }
    Column {
        OutlinedTextField(
            value = message.value,
            onValueChange = { message.value = it },
            label = { Text("Contact Us") }
        )
        Button(onClick = { }) {
            Text("Send")
        }
    }
}