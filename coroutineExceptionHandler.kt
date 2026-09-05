import kotlinx.coroutines.*

fun main() = runBlocking {

    val handler = CoroutineExceptionHandler { _, exception ->
        println("Error: ${exception.message}")
    }

    val scope = CoroutineScope(SupervisorJob() + handler)

    val job = scope.launch {
        throw Exception("Something went wrong.")
    }

    job.join()
}