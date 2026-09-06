import kotlinx.coroutines.*

fun main() = runBlocking {

    val job = launch {
        repeat(5) { i ->
            println("Running $i")
            delay(500)
        }
    }

    delay(1000)

    job.cancel()

    println("Cancelled")

    job.join()

    println("Finished")
}