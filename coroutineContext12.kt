import kotlinx.coroutines.*
fun main()=runBlocking{
    val scope=CoroutineScope(Dispatchers.Default)
    val job=scope.launch{
        delay(5000)
        println("Task Done")
        
    }
    delay(1000)
    job.cancel()
    println("Task Cancelled")
}