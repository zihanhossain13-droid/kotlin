import kotlinx.coroutines.*

fun main() {

    val scope = CoroutineScope(
        Dispatchers.IO + CoroutineName("DatabaseTask")
    )

    scope.launch {

        
        println(coroutineContext[CoroutineName]?.name)

        
        println(coroutineContext[CoroutineDispatcher])
    }

    Thread.sleep(1000)
}