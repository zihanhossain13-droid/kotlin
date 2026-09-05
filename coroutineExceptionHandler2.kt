import kotlinx.coroutines.*
fun main(){
    val handler=CoroutineExceptionHandler{_,exception->
        
            println("Error:${exception.message}")
        }

    val scope=CoroutineScope(SupervisorJob()+handler)
    
    
    scope.launch{
        throw Exception("Something went wrong")
    }

    Thread.sleep(1000)
}