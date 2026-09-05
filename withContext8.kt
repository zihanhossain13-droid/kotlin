import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.Default)
    scope.launch{
        val result=withContext(Dispatchers.IO){
            delay(500)
            "Data Loaded"
        }
        println(result)
       
    }
    Thread.sleep(1000)
}