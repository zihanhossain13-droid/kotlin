import kotlinx.coroutines.*
fun main()=runBlocking{
    val scope=CoroutineScope(Dispatchers.Default)
    val job=scope.launch{
        delay(3000)
        println("Task Done")
    }
    delay(1000)
    scope.cancel()
    println("Scope Cancelled")
    
}