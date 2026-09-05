fun countNumbers(vararg numbers: Int): Int {
    var count=0
  for(number in numbers){
    count++
  }
  return count
}
fun main(){
  println(countNumbers(10, 20, 30, 40, 50))
}