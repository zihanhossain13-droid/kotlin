import kotlinx.coroutines.*
fun main(){
    var scope=CoroutineScope(Dispatchers.Default+CoroutineName("ParentTask"))
    scope.launch{
        launch(CoroutineName("ChildTask")){
            println(coroutineContext[CoroutineName]?.name)
            println(coroutineContext[CoroutineDispatcher])
        }
        
    }
    Thread.sleep(1000)
}