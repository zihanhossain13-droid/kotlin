import kotlinx.coroutines.*

fun main() = runBlocking {

    val scope = CoroutineScope(Dispatchers.Default)

    val job = scope.launch {
        delay(3000)
        println("Task Done")
    }

    println("Active: ${job.isActive}")
    println("Completed: ${job.isCompleted}")
    println("Cancelled: ${job.isCancelled}")

    job.cancel()

    println("After Cancel:")
    println("Active: ${job.isActive}")
    println("Completed: ${job.isCompleted}")
    println("Cancelled: ${job.isCancelled}")
}