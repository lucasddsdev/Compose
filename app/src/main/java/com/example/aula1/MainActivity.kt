package com.example.aula1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.NotificationCompat.Style
import com.example.aula1.ui.theme.Aula1Theme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Aula1Theme {
                Column {
                    Welcome()
                    Transactions()
                }
            }
        }
    }
}
@Composable
fun Transactions(){

    LazyColumn(
        modifier = Modifier.padding(16.dp)
    ) {
        items(transactionsDummy.size){index ->
            Card(
                elevation = CardDefaults.cardElevation(8.dp)
            ) {

            }

        }
    }


}

@Composable
fun Welcome(){
    Row(
        modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
        ) {
        Text(
            text = "Welcome back, \n Lucas Dantas",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.weight(1f)
        )

        Icon(
            imageVector = Icons.Default.Delete,
            contentDescription = "Clear Transactions",
            tint = MaterialTheme.colorScheme.primary
        )

    }
}

private val transactionsDummy = listOf<String>(
    "Gasolina","Aluguel","Estudos","Cafe","Academia",
    "Gasolina","Aluguel","Estudos","Cafe","Academia",
    "Gasolina","Aluguel","Estudos","Cafe","Academia",
    "Gasolina","Aluguel","Estudos","Cafe","Academia",
    "Gasolina","Aluguel","Estudos","Cafe","Academia",
    "Gasolina","Aluguel","Estudos","Cafe","Academia",
    "Gasolina","Aluguel","Estudos","Cafe","Academia",
    "Gasolina","Aluguel","Estudos","Cafe","Academia",
    "Gasolina","Aluguel","Estudos","Cafe","Academia",
    "Gasolina","Aluguel","Estudos","Cafe","Academia",
    "Gasolina","Aluguel","Estudos","Cafe","Academia",
    "Gasolina","Aluguel","Estudos","Cafe","Academia",
    "Gasolina","Aluguel","Estudos","Cafe","Academia",
    "Gasolina","Aluguel","Estudos","Cafe","Academia",
)

