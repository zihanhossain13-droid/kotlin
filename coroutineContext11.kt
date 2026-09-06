import kotlinx.coroutines.*

fun main()=runBlocking {

    val scope = CoroutineScope(Dispatchers.Default)

    val job = scope.launch {
        delay(2000)
        println("Task Done")
    }

    println("Waiting...")

    job.join()

    println("Finished")
}