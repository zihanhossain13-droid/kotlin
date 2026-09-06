import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.IO+CoroutineName("Network Error"))
    scope.launch{
        println(coroutineContext[CoroutineName]?.name)
        println(coroutineContext[CoroutineDispatcher])
    }
    Thread.sleep(1500)
}