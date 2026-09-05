import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.Default)
    scope.launch{
        println("Starting")
        val result=withContext(Dispatchers.IO){
            delay(500)
            50*4
            
        }
        println(result)
    }
    Thread.sleep(1000)
    
}