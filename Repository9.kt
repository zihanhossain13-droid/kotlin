class Repository<T>{
  private var data=mutableListOf<T>()
  fun save(value:T){
data.add(value)
  }
  fun delete(value:T):Boolean{
    return data.remove(value)
  }
  fun getAll():List<T>{
    return data
  }
  
}
fun main(){
  val data=Repository<Int>()
  data.save(100)
  data.save(200)
  data.save(300)
  println(data.delete(100))
  println(data.getAll())

}