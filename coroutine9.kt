import kotlinx.coroutines.*
fun main()=runBlocking{
    val result=async{
        delay(1000)
        10+30
    }
    val result2=async{
        delay(2000)
        20+30
    }
    println(result.await()+result2.await())
    
}