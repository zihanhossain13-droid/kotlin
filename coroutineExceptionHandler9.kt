import kotlinx.coroutines.*
fun main()=runBlocking{
    val handler=CoroutineExceptionHandler{
        _,exception->
        println("Error:${exception.message}")
    }
    val scope=CoroutineScope(SupervisorJob()+handler)
    scope.launch{
        throw Exception("Database Error")
    }
    scope.launch{
        throw Exception("Network Error")
    }
    scope.launch{
        println("App Started")
    }
    Thread.sleep(1000)
}