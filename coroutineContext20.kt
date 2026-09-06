import kotlinx.coroutines.*

fun main() = runBlocking {

    val parentJob = launch {

        launch {
            delay(1000)
            println("Child Done")
        }

        println("Parent Running")
    }

    parentJob.join()

    println("Parent Completed")
}