import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.Default)
    scope.launch{
        val result=withContext(Dispatchers.IO){
    " hello kotlin ".trim().uppercase()
        
    }
        println(result)
    }
    Thread.sleep(1500)
}