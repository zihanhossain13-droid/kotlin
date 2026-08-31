interface Counter{
  fun increment()
  fun getCount()
}
fun main(){
  val counter=object:Counter{
    private var count=0
    override fun increment(){
      count++
    }
    override fun getCount(){
      println(count)
    }
  }
  counter.increment()
  counter.increment()
  counter.increment()
  counter.getCount()
}