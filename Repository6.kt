class Repository<T>{
  private var data=mutableListOf<T>()
  fun save(value:T){
data.add(value)
  }
  fun getAll():List<T>{
    return data
  }
}
fun main(){
  var data=Repository<String>()
  data.save("Zihan")
  data.save("Hossain")
  data.save("Rahim")
  var output=data.getAll()
  println(output)
}