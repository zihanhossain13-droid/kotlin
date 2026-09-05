import kotlinx.coroutines.*
fun main()=runBlocking{
    val scope=CoroutineScope(Dispatchers.Default)
    val result=scope.launch{
        while(isActive){
            println("Running...")
            delay(1000)
        }
    }
    delay(3000)
    scope.cancel()
    result.join()
    println("Finished")
    
}