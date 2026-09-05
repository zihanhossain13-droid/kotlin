import kotlinx.coroutines.*
suspend fun sayHello(){
        delay(1000)
        println("Hello Kotlin")
}
fun main()=runBlocking{
    sayHello()
    
}