import kotlinx.coroutines.*
fun main()=runBlocking{
    val handler=CoroutineExceptionHandler{
        _,exception->
        println("Error:${exception.message}")
    }
    val scope=CoroutineScope(SupervisorJob()+handler)
    scope.launch{
        println("Login Started")
        delay(1000)
        throw Exception("Network Error")
    }
    scope.launch{
        delay(1500)
        println("UI updated")
    }
    Thread.sleep(2000)
}