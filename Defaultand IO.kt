import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.Default)
    scope.launch{
        println("CPU Task")
        
    }
    val scope2=CoroutineScope(Dispatchers.IO)
    scope2.launch{
        println("IO Task")
    }
    Thread.sleep(1000)
    
}