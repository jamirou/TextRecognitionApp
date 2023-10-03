package com.example.textrecognitionapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.textrecognitionapp.ui.theme.TextRecognitionAppTheme
import com.example.textrecognitionapp.viewModel.ScannerViewModel
import com.example.textrecognitionapp.views.TabsView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val viewModel: ScannerViewModel by viewModels()
        super.onCreate(savedInstanceState)
        setContent {
            TextRecognitionAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TabsView(viewModel)
                }
            }
        }
    }
}

