import kotlinx.coroutines.*
fun main()=runBlocking{
    var count=1
    val scope=CoroutineScope(Dispatchers.Default)
    
   val result=scope.launch{ while(isActive){
println("Running:$count")
count++
        delay(1000)
    }
   }
    delay(3000)
    scope.cancel()
    result.join()
    println("Finished")
}