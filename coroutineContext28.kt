import kotlinx.coroutines.*

fun main() = runBlocking {

    supervisorScope {

        launch {
            try {
                throw Exception("Database Error")
            } catch (e: Exception) {
                println("Error: ${e.message}")
            }
        }

        launch {
            delay(1000)
            println("Data Loaded")
        }
    }

    println("Finished")
}