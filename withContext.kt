import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.Default)
    scope.launch{
        println("Default Task")
         withContext(Dispatchers.IO){
        println("IO Task")
         }
    }
    
   
    Thread.sleep(1000)
}