import kotlinx.coroutines.*
fun main()=runBlocking{
    supervisorScope{
        launch{
            try{
                throw Exception("Task1 Failed")
            }catch(e:Exception){
                println("Error:${e.message}")
            }
        }
        launch{
        delay(1000)
        println("Task 2 Done")
        }
    }
    println("Finished")
}