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
  val data=Repository<String>()
  data.save("Info")
  val result=data.get()
  println(result)
  
}