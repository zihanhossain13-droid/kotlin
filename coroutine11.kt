import kotlinx.coroutines.*
fun main()=runBlocking{
    val result1=async{
        delay(1000)
        10+10
    }
    val result2=async{
        delay(2000)
        20+20
    }
    val result3=async{
        30+30
    }
    println(result1.await()+result2.await()+result3.await())
    
}