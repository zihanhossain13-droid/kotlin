import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.Default)
    scope.launch{
        val age=16
        val result=withContext(Dispatchers.IO){
            if(age>=18)
            "Adult"
            else
            "Minor"
            
        }
        println(result)
    }
    Thread.sleep(1500)
}