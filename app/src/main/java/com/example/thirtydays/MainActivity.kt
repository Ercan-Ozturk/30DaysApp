package com.example.thirtydays

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirtydays.ui.theme.ThirtyDaysTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThirtyDaysTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PhotographyList()
                }
            }
        }
    }
}


@Composable
fun PhotographyCard(dayCount: String, title: String) {
    Card(modifier = Modifier
        .fillMaxWidth()) {
        Column(modifier = Modifier.padding(8.dp)) {
            Text(text = "Day " + dayCount)
            Text(text = title)
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null,
                Modifier.fillMaxWidth()
            )
            Text(text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries ")
        }

    }


}

@Preview
@Composable
fun PhotographyCardPreview() {
    ThirtyDaysTheme() {
        PhotographyCard("1", "Spend 15 min")
    }

}

@Preview
@Composable
fun PhotographyList() {
    LazyVerticalGrid(GridCells.Fixed(1), modifier = Modifier
        .fillMaxSize()
        .padding(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
        item {
            PhotographyCard("1","Spend 15 min")
            Spacer(Modifier.size(8.dp))
        }
        item {
            PhotographyCard("1", "Spend 15 min")
            Spacer(Modifier.size(8.dp))

        }
        item {
            PhotographyCard("1", "Spend 15 min")
            Spacer(Modifier.size(8.dp))
        }
        item {
            PhotographyCard("1", "Spend 15 min")
            Spacer(Modifier.size(8.dp))
        }
        item {
            PhotographyCard("1", "Spend 15 min")
            Spacer(Modifier.size(8.dp))
        }
        item {
            PhotographyCard("1", "Spend 15 min")
            Spacer(Modifier.size(8.dp))
        }
        item {
            PhotographyCard("1", "Spend 15 min")
            Spacer(Modifier.size(8.dp))
        }

    }
}