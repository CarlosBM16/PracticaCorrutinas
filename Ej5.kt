import kotlin.system.*
import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Descargando múltiples archivos...")

    val archivo1 = launch {
        descargarArchivo()
    }
    val archivo2 = launch {
        descargarArchivo()
    }
    val archivo3 = launch {
        descargarArchivo()
    }

    archivo1.join()
    archivo2.join()
    archivo3.join()
}

suspend fun descargarArchivo() {
    println("Descargando archivo...")

    // Manejo de progreso
    for (i in 1..5) {
        delay(500)
        println("${i*20}% descargado")
    }

    println("Archivo descargado en /home/user/downloads")
}


