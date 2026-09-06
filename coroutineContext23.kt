import kotlinx.coroutines.*

fun main() = runBlocking {

    val parentJob = launch {

        val childJob = launch {
            delay(3000)
            println("Child Done")
        }

        delay(1000)

        childJob.cancel()

        println("Parent Still Running")
    }

    parentJob.join()

    println("Parent Completed")
}