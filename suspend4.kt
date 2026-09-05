import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.Default)
    scope.launch{
        println("Hello Scope")
    }
    Thread.sleep(1000)
    
}