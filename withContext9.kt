import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.Default)
    scope.launch{
        val result=withContext(Dispatchers.IO){
            delay(500)
            "Hello Kotlin".lowercase()
        }
        println(result)
    }
    Thread.sleep(2000)
}