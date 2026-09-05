import kotlinx.coroutines.*

fun main() = runBlocking {

    launch{
        delay(1000)
        println("Hello Coroutine")
    }

    println("Main")
}