import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.Default)
    scope.launch{
        val result=withContext(Dispatchers.IO){
            delay(500)
            10+20
        }
        println(result)
        val result2=withContext(Dispatchers.IO){
        delay(500)
        40+50
        }
        println(result2)
        println(result2+result)
    }
    Thread.sleep(2000)
}