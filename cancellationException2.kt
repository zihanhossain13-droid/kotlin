import kotlinx.coroutines.*

fun main() = runBlocking {

    val job = launch {

        try {
            delay(3000)
            println("Task Done")
        } catch (e: CancellationException) {
            println("Task Cancelled")
        }
    }

    delay(1000)

    job.cancelAndJoin()

    println("Finished")
}