class Repository<T>{
  private var data=mutableListOf<T>()
  fun save(value:T){
data.add(value)
  }
  fun findFirst(predicate:(T)->Boolean):T?{
    return data.firstOrNull(predicate)
  }
  fun first():T?{
    return data.firstOrNull()
  }
  fun last():T?{
    return data.lastOrNull()
  }
  fun count():Int{
    return data.size
  }
  fun clear(){
    return data.clear()
  }
  fun isEmpty():Boolean{
    if(data.isEmpty()){
      return true
    }else{
      return false
    }
  }
  
  
}
fun main(){
  val data=Repository<Int>()
  data.save(100)
  data.save(200)
  data.save(300)
  println(data.findFirst{it>100})
  println(data.count())
  data.clear()
  println(data.count())
  println(data.isEmpty())
  println(data.first())
  println(data.last())
  

}