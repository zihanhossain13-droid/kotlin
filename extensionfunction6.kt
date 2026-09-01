fun List<Int>.sumOfEven():Int{
  return this.filter{it%2==0}.sum()
}
fun main(){
  val numbers=listOf(1,2,3,4,5,6)
val result=numbers.sumOfEven()
println(result)
}