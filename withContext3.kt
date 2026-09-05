import kotlinx.coroutines.*
fun main(){
    val scope=CoroutineScope(Dispatchers.Default)
    scope.launch{
        println("CPU Task")
        withContext(Dispatchers.IO){
        println("IO Task")
        }
        println("CPU Task Done")
    }
    Thread.sleep(1000)
}