import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.Default)
    scope.launch{
        val result=withContext(Dispatchers.IO){
            10+20
        }
        println(result)
    }
    Thread.sleep(1000)
    
}