import kotlinx.coroutines.*
fun main()=runBlocking{
    var handler=CoroutineExceptionHandler{
        _,exception->
        println("Error:${exception.message}")
    }
    val scope=CoroutineScope(SupervisorJob()+handler)
    scope.launch{
        println("Active:$isActive")
        delay(1000)
        throw Exception("Server Error")
    }
    scope.launch{
        delay(1500)
        println("Second Task Done")
    }
    Thread.sleep(2000)
}