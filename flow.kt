import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
fun main()=runBlocking{
    val numbers=flow{
        emit(1)
        emit(2)
        emit(3)
    }
    numbers.collect{
        println(it)
    }
   
    
}