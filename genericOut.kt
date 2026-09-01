open class Animal
class Dog:Animal()
class Box<out T>(val value:T){
  }
  
  fun main(){
      val dogBox=Box(Dog())
  val animalBox:Box<Animal> =dogBox
  println(animalBox.value)
  }