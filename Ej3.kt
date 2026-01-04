import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        llamadaAPI()
    }
}

suspend fun llamadaAPI() {
    println("Haciendo petición...")
    delay(2000)
    println("""
    {
      "status": "success",
      "code": 200,
      "message": "Solicitud procesada correctamente",
      "data": {
        "user": {
          "id": 42,
          "username": "danthalion",
          "email": "danthalion@example.com",
          "profile": {
            "name": "Dan",
            "avatarUrl": "https://example.com/avatar.png"
          }
        },
        "preferences": {
          "theme": "dark",
          "language": "es",
          "notifications": true
        }
      }
    }
    """)
}