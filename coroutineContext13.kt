import kotlinx.coroutines.*

fun main() = runBlocking {

    val scope = CoroutineScope(Dispatchers.Default)

    val job = scope.launch {
        delay(3000)
        println("Task Done")
    }

    println(job.isActive)

    delay(1000)

    job.cancel()

    println(job.isActive)
}