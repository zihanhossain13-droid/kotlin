import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
fun main()=runBlocking{
    var attempt=0
    var numbers=flow{
        attempt++
        println("Attempts:$attempt")
        if(attempt<3){
            throw Exception("Error")
        }
        emit(100)
    }
    numbers.retry(2).catch{
        println("Error:${it.message}")
    }.collect{
        println("Value:$it")
    }
    
}