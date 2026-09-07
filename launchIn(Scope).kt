import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
fun main()=runBlocking{
    val scope=CoroutineScope(Dispatchers.Default)
    val numbers=flow{
        emit(10)
        emit(20)
        emit(30)
    }
    val job=numbers.onEach{
        println("Value:$it")
    }.launchIn(scope)
    runBlocking{
        job.join()
    }
}