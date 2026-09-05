import kotlinx.coroutines.*
fun main()=runBlocking{
    val result=async{
        delay(1000)
        10+20
    }
    println("Main")
    println(result.await())
}