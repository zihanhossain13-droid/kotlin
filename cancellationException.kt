import kotlinx.coroutines.*

fun main() = runBlocking {

    val job = launch {
        try {
            repeat(5) { i ->
                println("Running $i")
                delay(500)
            }
        } catch (e: CancellationException) {
            println("Coroutine Cancelled")
        }
    }

    delay(1100)

    job.cancelAndJoin()

    println("Finished")
}