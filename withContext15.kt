import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.Default)
    scope.launch{
        val age=20
        val marks=80
        val result=withContext(Dispatchers.IO)
        {
            delay(500)
            if(age>=18)
            marks+10
            else 
            marks
        }
        println(result)
    }
    Thread.sleep(1500)
}