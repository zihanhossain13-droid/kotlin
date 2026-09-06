import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.IO+CoroutineName("Data Task"))
    scope.launch{
        println(coroutineContext[CoroutineName]?.name)
        println(coroutineContext[CoroutineDispatcher])
        println(coroutineContext[Job])
    }
    Thread.sleep(1000)
}