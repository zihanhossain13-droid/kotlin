import kotlinx.coroutines.*
fun main()=runBlocking{
    suspend fun getNumber():Int{
        delay(1000)
        return 50
    }
    val result=async{
        getNumber()
    }
    println(result.await())
    
}