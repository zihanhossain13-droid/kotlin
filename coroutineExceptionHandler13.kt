import kotlinx.coroutines.*
fun main()=runBlocking{
    val handler=CoroutineExceptionHandler{
        _,exception->
        println("Error:${exception.message}")
    }
    val scope=CoroutineScope(SupervisorJob()+handler)
    scope.launch{
        delay(1000)
        throw Exception("Task Failed")
    }
    scope.launch{
        delay(1500)
        println("Task 2 complete")
    }
    Thread.sleep(2000)
}