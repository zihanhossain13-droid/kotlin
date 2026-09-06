import kotlinx.coroutines.*

fun main() = runBlocking {

    val job = launch {

        try {
            delay(3000)
            println("Task Done")

        } catch (e: CancellationException) {
            println("Task Cancelled")

            withContext(NonCancellable) {
                delay(1000)
                println("Cleanup Done")
            }

        } finally {
            println("Finally")
        }
    }

    delay(1000)

    job.cancelAndJoin()

    println("Finished")
}