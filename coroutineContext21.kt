import kotlinx.coroutines.*

fun main() = runBlocking {

    val parentJob = launch {

        launch {
            delay(3000)
            println("Child Done")
        }

        delay(5000)
        println("Parent Done")
    }

    delay(1000)

    parentJob.cancel()

    parentJob.join()

    println("Finished")
}