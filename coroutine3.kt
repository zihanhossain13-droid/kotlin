import kotlinx.coroutines.*

fun main() = runBlocking {

    launch{
        delay(1000)
        println("Hello")
    }
    launch{
        delay(2000)
        println("Kotlin")
    }

    println("Main")
}