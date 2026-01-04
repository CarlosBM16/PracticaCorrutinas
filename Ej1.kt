import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Inicio del proceso")

    login()
    cargarPerfil()
    cargarPreferencias()

    println("Proceso finalizado")
}

suspend fun login() {
    println("Iniciando login...")
    delay(1000) 
    println("Login completado")
}

suspend fun cargarPerfil() {
    println("Cargando perfil...")
    delay(1000) 
    println("Perfil cargado")
}

suspend fun cargarPreferencias() {
    println("Cargando preferencias...")
    delay(1000) 
    println("Preferencias cargadas")
}
