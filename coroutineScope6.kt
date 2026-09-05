import kotlinx.coroutines.*
fun main()=runBlocking{
    val scope=CoroutineScope(Dispatchers.Default)
    val result=scope.launch{
        var count=1
        while(isActive){
            println("Running $count")
            count++
            delay(1000)
        }
    }
    delay(3000)
    scope.cancel()
    result.join()
    println("Finished")
    
}