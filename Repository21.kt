
class Repository<T>{
  private var data=mutableListOf<T>()
  fun save(value:T){
    data.add(value)
  }
  fun <R>map(transform:(T)->R):List<R>{
    return data.map(transform)
  }
  
  
}
data class User(
  var name:String,
  var age:Int
)
fun main(){
  val data=Repository<String>()
  data.save("Zihan")
  data.save("Hossain")
  data.save("Rahim")
  println(data.map{User(it,20)})

  

}