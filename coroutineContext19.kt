import kotlinx.coroutines.*

fun main() = runBlocking {

    val scope = CoroutineScope(Dispatchers.Default)

    val job = scope.launch {
        delay(1000)
        println("Task Done")
    }

    job.join()

    println("Active: ${job.isActive}")
    println("Completed: ${job.isCompleted}")
    println("Cancelled: ${job.isCancelled}")
}