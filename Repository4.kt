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
  var data=Repository<Int>()
  data.save(100)
  val result=data.get()
println(result)
}