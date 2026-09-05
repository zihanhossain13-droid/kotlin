import kotlinx.coroutines.*
fun main()=runBlocking{
    val handler=CoroutineExceptionHandler{
        _,exception->
        println("Error:${exception.message}")
    }
    val job=launch(handler){
        throw Exception("Something want wrong.")
    }
    job.join()
}