import kotlinx.coroutines.*

// Por limitaciones del Kotlin Playground, he limitado el temporizador a 5 segundos

fun main() = runBlocking {
	println("Inicio del temporizador")
	
    val timer = launch {
        var seconds = 0
        while (true) {
            delay(1000)
            seconds++
            println("Segundos: " + seconds)
        }
    }
    
    delay(5000) 
    println("Cancelando temporizador...")
    timer.cancel() 
    
    timer.join()
}