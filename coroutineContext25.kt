import kotlinx.coroutines.*
fun main=runBlocking{
    supervisor{
        launch{
            throw exception("Task 1 Failed.")
        }
        launch{
            delay(1000)
            println("Task 2 Done")
        }
    }
    println("Finished")
}