fun findMax(vararg numbers: Int): Int {
  var big=0
    for(number in numbers){
      if(number>big){
        big=number
      }
    }
      return big
    
}
fun main(){
 println(findMax(10, 50, 30, 80, 20))
}