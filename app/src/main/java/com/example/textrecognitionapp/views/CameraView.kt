package com.example.textrecognitionapp.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.textrecognitionapp.viewModel.ScannerViewModel

@Composable
fun CameraView(viewModel: ScannerViewModel) {
    Text(text = "Camera")
}