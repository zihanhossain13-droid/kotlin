open class Animal(var name:String){
  open fun sound(){
    println("$name makes sound.")
  }
}
fun main(){
  var dog=object:Animal("Tommy"){
    override fun sound(){
      println("$name makes sound")
    }
  }
  dog.sound()
}