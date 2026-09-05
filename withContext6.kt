import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.Default)
    scope.launch{
        println("Task1")
        withContext(Dispatchers.IO){
        delay(500)
        println("IO Task")
        }
        println("Task2")
        
    
    }
    Thread.sleep(1000)
    
}