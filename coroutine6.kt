import kotlinx.coroutines.*
fun main()=runBlocking{
        println("Start")
    
    val job2=launch{
        delay(1000)
        println("Task1")
    }
    val job3=launch{
        delay(1000)
        println("Task2")
    }
    job2.join()
    job3.join()
    println("Finished")
}