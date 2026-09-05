import kotlinx.coroutines.*
fun main()=runBlocking{
    val scope=CoroutineScope(Dispatchers.Default)
    val job=scope.launch{
        println(isActive)
        delay(3000)
        println("Done")
    }
 job.join()   
}