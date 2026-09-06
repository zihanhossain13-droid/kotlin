import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.Default+CoroutineName("MyTask"))
    scope.launch{
    println(coroutineContext[CoroutineName]?.name)
    }
    Thread.sleep(500)
}
