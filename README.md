# Text Recognition App

## Descripción del Proyecto

Esta es una aplicación Android desarrollada con Jetpack Compose y Kotlin que se enfoca en el reconocimiento de texto en imágenes y la navegación a través de intents. Las principales funcionalidades de la aplicación incluyen:

- Abrir la galería para seleccionar imágenes.
- Abrir la cámara para capturar nuevas imágenes.
- Generar elementos visuales a partir de las imágenes seleccionadas en la galería.
- Utilización de ML Kit para el reconocimiento de texto en imágenes.
- Creación de una cuadrícula (grid) para mostrar las imágenes seleccionadas.

## Aprendizaje

Algunos de los conceptos y habilidades que puedes aprender de este proyecto son:

- Cómo tomar imágenes desde la galería y la cámara.
- Cómo tomar múltiples imágenes desde la galería y construir una cuadrícula utilizando FlowRow
- Uso de `ViewModel` y `Provider` para gestionar la lógica y la comunicación con la cámara.

## Arquitectura

El proyecto está organizado en los siguientes paquetes y componentes principales:

- **views**: Contiene las vistas de la aplicación, incluyendo la vista de la cámara, la vista de la galería, la vista de la colección y las pestañas de navegación.
- **viewModel**: Contiene el `ScannerViewModel`, que gestiona la lógica relacionada con la cámara y el reconocimiento de texto en imágenes.


## Ejemplo de Código

A continuación, se muestra un ejemplo de código relevante de la aplicación:

```kotlin
// ScannerViewModel.kt
class ScannerViewModel : ViewModel() {
    // ...
    // (Incluye aquí las funciones y propiedades relevantes del ViewModel)
    // ...
}

// CameraView.kt
@Composable
fun CameraView(viewModel: ScannerViewModel) {
    // ...
    // (Incluye aquí el código de la vista de la cámara)
    // ...
}

// CollectionGalleryView.kt
@Composable
fun CollectionGalleryView() {
    // ...
    // (Incluye aquí el código de la vista de la colección)
    // ...
}

// TabsView.kt
@Composable
fun TabsView(viewModel: ScannerViewModel) {
    // ...
    // (Incluye aquí el código de las pestañas de navegación)
    // ...
}
