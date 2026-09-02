data class User(
  val name:String,
  val age:Int
)
class Repository<T>{
  private var data=mutableListOf<T>()
  fun save(value:T){
    data.add(value)

  }
  fun <R> map(transform:(T)->R):List<R>{
    return data.map(transform)
  }
}
fun main(){
  val data=Repository<User>()
  data.save(User("Zihan",20))
  data.save(User("Rahim",25))
  data.save(User("Karim",30))
  println(data.map{it.age})
}