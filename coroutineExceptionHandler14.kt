import kotlinx.coroutines.*
fun main()=runBlocking{
    val handler=CoroutineExceptionHandler{_,exception->
    println("Error:${exception.message}")
    }
    val scope=CoroutineScope(SupervisorJob()+handler)
    scope.launch{
        delay(1000)
        throw Exception("Database Error")
    }
    scope.launch{
        delay(1500)
        println("Task 2 Done")
    }
    scope.launch{
        delay(2000)
        throw Exception("Network Error")
    }
    Thread.sleep(2500)
}