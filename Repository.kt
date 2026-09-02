class Repository<T>{
  fun save(data:T){
    println("Saved:$data")
  }
}
fun main(){
  val data=Repository<String>()
  data.save("Info")
}