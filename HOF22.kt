fun processNumbers(numbers:List<Int>,condition:(Int)->Boolean,operation:(Int)->Int):List<Int>{
  return numbers.filter(condition).map(operation)
}
fun main(){
  val number = listOf(2, 3, 4, 5, 6)
  val result=processNumbers(number,{it%2==0},{it*it})
  println(result)
}