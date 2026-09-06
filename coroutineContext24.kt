import kotlinx.coroutines.*

fun main() = runBlocking {

    val scope = CoroutineScope(SupervisorJob())

    scope.launch {
        throw Exception("Task 1 Failed")
    }

    scope.launch {
        delay(1000)
        println("Task 2 Done")
    }

    delay(2000)
}