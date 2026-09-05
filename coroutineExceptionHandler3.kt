import kotlinx.coroutines.*
fun main(){
    var handler=CoroutineExceptionHandler{
        _,exception->
        println("Error:${exception.message}")
    }
    val scope=CoroutineScope(SupervisorJob()+handler)
    scope.launch{
        println("Task1")
    }
    scope.launch{
        throw Exception("Task 2 Failed")
    }
    Thread.sleep(1000)
}