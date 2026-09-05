import kotlinx.coroutines.*
fun main()=runBlocking{
    val job1=launch{
        delay(1000)
        println("Hello")
    }
    val job2=launch{
        delay(2000)
        println("kotlin")
    }
    job1.join()
    job2.join()
    println("All done")
}