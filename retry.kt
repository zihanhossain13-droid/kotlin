import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
fun main()=runBlocking{
    var numbers=flow{
        println("Flow Running")
        emit(10)
        throw Exception("Error!")
        
    }
    numbers.retry(2).collect{
        println(it)
    }
}