import kotlinx.coroutines.*

fun main() = runBlocking {

    val parentJob = launch {

        launch {
            delay(3000)
            println("Child 1 Done")
        }

        launch {
            delay(5000)
            println("Child 2 Done")
        }

        println("Parent Running")
    }

    delay(1000)

    parentJob.cancel()

    println("Parent Cancelled")

    parentJob.join()

    println("Finished")
}