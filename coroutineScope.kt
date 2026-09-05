import kotlinx.coroutines.*
fun main()=runBlocking{
    val scope=CoroutineScope(Dispatchers.Default)
    val job=scope.launch{
        delay(1000)
        println("Task Done")
    }
    job.join()
    println("Finished")
    
}