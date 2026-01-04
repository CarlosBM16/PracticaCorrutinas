import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Usuario activo, enviando nitificaciones...")
    
    val notificaciones : Job = launch {
        while (isActive) {
            println("Notificación recibida")
            delay(500)
        }
        println("Trabajo finalizado")
    }
    
    delay(5000)
    println("Usuario inactivo, cancelando notificaciones...")
    
    notificaciones.cancel()
    notificaciones.join()
}