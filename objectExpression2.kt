interface Animal{
  fun sound()
}
fun main(){
  val dog=object:Animal{
    override fun sound(){
      println("Dogs says woof")
    }
  }
  dog.sound()
}