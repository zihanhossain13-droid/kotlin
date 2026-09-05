import kotlinx.coroutines.*

fun main() = runBlocking {

    launch {
        delay(1000)
        println("Hello")
    }

    println("Main")
}