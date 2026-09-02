class Repository<T>{
  private var data:T?=null
  fun save(value:T){
data=value
  }
  fun get():T?{
    return data
  }
}
fun main(){
  var data=Repository<String>()
  data.save("Zihan")
  val result=data.get()
println(result)
data.save("Hossain")
val result2=data.get()
println(result2)
}