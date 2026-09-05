import kotlinx.coroutines.*
fun main()=runBlocking{
    val handler=CoroutineExceptionHandler{
        _,exception->
        println("Error:${exception.message}")
    }
    val scope=CoroutineScope(SupervisorJob()+handler)
    scope.launch{
        println("Before:$isActive")
        delay(1000)
        throw Exception("Task Failed")
    }
    Thread.sleep(2000)
}