import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.IO)
    scope.launch{
        println("Running on IO")
    }
    Thread.sleep(1000)
}