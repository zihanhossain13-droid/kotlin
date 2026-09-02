class Repository<T>{
  private var data=mutableListOf<T>()
  fun save(value:T){
data.add(value)
  }
  fun update(oldvalue:T,value:T):Boolean{
    val index=data.indexOf(oldvalue)
    if(index!=-1){
      data[index]=value
      return true
    }
    return false
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
  println(data.update(100,200))
  println(data.getAll())

}