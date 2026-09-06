import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.Default)
    scope.launch{
        val result=withContext(Dispatchers.IO)
        {
            " kotlin ".trim().length
        }
        println(result)
    }
    Thread.sleep(1000)
}