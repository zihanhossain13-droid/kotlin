import kotlinx.coroutines.*

fun main() = runBlocking {

    val job = launch {
        repeat(5) { i ->
            println("Running $i")
            delay(500)
        }
    }

    delay(1100)

    job.cancelAndJoin()

    println("Finished")
}