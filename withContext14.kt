import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.Default)
    scope.launch{
        val result=withContext(Dispatchers.IO){
            delay(500)
            val age=20
            if(age>=18)
            "Adult"
            else
            "Minor"
            
            
        }
        println(result)
    }
    Thread.sleep(1000)
}