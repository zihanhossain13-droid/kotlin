import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
fun main()=runBlocking{
    val numbers=flow{
        emit(10)
        emit(20)
        emit(30)
       
        
    }
    numbers.collect{values->
    println(values)}
    
}