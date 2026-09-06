import kotlinx.coroutines.*

fun main() {

    val scope = CoroutineScope(
        Dispatchers.Default + CoroutineName("ParentTask")
    )

    scope.launch(CoroutineName("ChildTask")) {

        println(coroutineContext[CoroutineName]?.name)

        println(coroutineContext[CoroutineDispatcher])
    }

    Thread.sleep(1000)
}