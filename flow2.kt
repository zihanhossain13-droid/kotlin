import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
    fun main()=runBlocking{
        val numbers=flow{
            emit(1)
            delay(1000)
            emit(2)
            delay(1000)
            emit(3)
            
        }
        numbers.collect{
            println(it)
        }
    }