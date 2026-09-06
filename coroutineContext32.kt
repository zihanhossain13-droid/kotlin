import kotlinx.coroutines.*

fun main() = runBlocking {

    val job = launch {

        repeat(5) { i ->

            ensureActive()

            println("Running $i")

            delay(500)
        }
    }

    delay(1200)

    job.cancelAndJoin()

    println("Finished")
}