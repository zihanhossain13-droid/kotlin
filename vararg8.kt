fun findMax(vararg numbers: Int): String {
    var big=numbers[0]
  for(number in numbers){
    if(number>big){
      big=number
    }
  }
  return "$big"
}
fun main(){
   println(findMax(-10, -5, -20, -2, -8))
}