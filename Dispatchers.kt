import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.Default)
    scope.launch{
        println("Running on Default")
    }
    Thread.sleep(1000)
}