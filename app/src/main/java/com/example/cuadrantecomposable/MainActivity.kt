package com.example.cuadrantecomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantecomposable.ui.theme.CuadranteComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteComposableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Contenido()
                }
            }
        }
    }
}

@Composable
fun Contenido() {
    Column(
        Modifier.fillMaxWidth(1f)
    ) {
        Row(Modifier.weight(1f)) {
            Cuadro(
                titulo = stringResource(R.string.titulo1),
                texto = stringResource(R.string.texto1),
                Modifier
                    .weight(1f)
                    .height(500.dp),
                Color(0xFFEADDFF)
            )
            Cuadro(
                titulo = stringResource(R.string.titulo2),
                texto = stringResource(R.string.texto2),
                Modifier
                    .weight(1f)
                    .height(500.dp),
                Color(0xFFD0BCFF)
            )
        }
        Row(Modifier.weight(1f)) {
            Cuadro(
                titulo = stringResource(R.string.titulo3),
                texto = stringResource(R.string.texto3),
                Modifier
                    .weight(1f)
                    .height(500.dp),
                Color(0xFFB69DF8)
            )
            Cuadro(
                titulo = stringResource(R.string.titulo4),
                texto = stringResource(R.string.texto4),
                Modifier
                    .weight(1f)
                    .height(500.dp),
                Color(0xFFF6EDFF)
            )
        }

    }

}

@Composable
fun Cuadro(titulo: String, texto: String, modifier: Modifier = Modifier, color: Color) {
    Column(
        modifier
            .background(color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = titulo,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(bottom = 16.dp)
        )
        Text(
            text = texto,
            textAlign = TextAlign.Justify,
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteComposableTheme {
        Contenido()
    }
}