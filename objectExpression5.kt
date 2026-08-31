open class Animal{
  open fun sound(){
    println("Animal makes sound.")
  }
}
fun main(){
  val dog=object:Animal(){
    var sound="Woof"
    override fun sound(){
      println("Dog says $sound")
    }
  }
  dog.sound()
}