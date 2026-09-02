data class user(
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
  val data=Repository<user>()
  data.save(user("Zihan",22))
  data.save(user("Hossain",23))
  println(data.map{it.name})

}