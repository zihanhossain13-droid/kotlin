open class Animal
class Dog:Animal()
class Consumer<in T>{
  fun consume(value:T){
    println(value)
  }
}
fun main(){
  val AnimalConsumer=Consumer<Animal>()
   AnimalConsumer.consume(Dog())
  
}
