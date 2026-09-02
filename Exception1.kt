fun main(){
  val numbers=listOf(10,20)
  try{
    println(numbers[5])
  }catch(e:IndexOutOfBoundsException){
    println("Wrong Index")

  }
}