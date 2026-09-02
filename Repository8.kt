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
  val data=Repository<Int>()
  data.save(100)
  println(data.find(100))

}