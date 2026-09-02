class Repository<T>{
  private var data=mutableListOf<T>()
  fun save(value:T){
data.add(value)
  }
  fun find(value:T):Boolean{
    return data.contains(value)
  }
  
}
fun main(){
  val data=Repository<String>()
  data.save("Zihan")
  println(data.find("Zihan"))

}