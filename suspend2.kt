import kotlinx.coroutines.*

fun main()=runBlocking{
    suspend fun sayHello(){
        delay(1000)
        println("Hello Kotlin")
}
    sayHello()
    
}