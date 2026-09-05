import kotlinx.coroutines.*
fun main()=runBlocking{
    val handler=CoroutineExceptionHandler{_,exception->
    println("Error:${exception.message}")}
    val scope=CoroutineScope(SupervisorJob()+handler)
    scope.launch{
        println("Data Loaded")
    }
    scope.launch{
        throw Exception("Server Error")
    }
    Thread.sleep(1000)
}