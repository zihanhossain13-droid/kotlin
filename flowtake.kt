import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
fun main()=runBlocking{
    val numbers=flow{
        emit(1)
        emit(2)
        emit(3)
        emit(4)
        emit(5)
    }
    numbers.take(3).collect{
        println(it)
    }
}