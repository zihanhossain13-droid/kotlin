import kotlinx.coroutines.*
fun main()=runBlocking{
    val handler=CoroutineExceptionHandler{
        _,exception->
        println("Error:${exception.message}")
    }
    val scope=CoroutineScope(SupervisorJob()+handler)
    scope.launch{
        delay(500)
        throw Exception("Database Error")
    }
    scope.launch{
        delay(1000)
        println("Data Loaded")
    }
    scope.launch{
        delay(1500)
        throw Exception("Network Error")
    }
    Thread.sleep(2000)
}