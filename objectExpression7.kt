open class Animal(var name:String){
  open fun sound(){
    println("$name makes sound.")
  }
}
fun main(){
  var s=Animal(name="DOG")
  var dog=object:Animal(s.name){
    override fun sound(){
      println("$name makes sound")
    }
  }
  dog.sound()
}