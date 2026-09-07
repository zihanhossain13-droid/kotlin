import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
fun main()=runBlocking{
    val state=MutableStateFlow(0)
    val job=launch{
        state.collect{
            println("Value:$it")
        }
    }
    delay(100)
    state.value=10
    state.value=10
    state.value=20
    delay(100)
    job.join()
}