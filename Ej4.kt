import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println("Pronóstico del clima")

        val temperatura: Deferred<String> = async {
            getTemperatura()
        }
        val humedad: Deferred<String> = async {
            getHumedad()
        }
        val viento: Deferred<String> = async {
            getViento()
        }
        println("${temperatura.await()} ${humedad.await()} ${viento.await()}")
    }
}

suspend fun getTemperatura(): String {
    delay(1000)
    return "Soleado"
}

suspend fun getHumedad(): String {
    delay(1000)
    return "30\u00b0C"
}

suspend fun getViento(): String {
    delay(1000)
    return "1.5m/s"
}
