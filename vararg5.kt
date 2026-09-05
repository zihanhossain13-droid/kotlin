fun averageNumbers(vararg numbers: Int): Double {
    return numbers.average()
}
fun main(){
  println(averageNumbers(10, 20, 30, 40))
}