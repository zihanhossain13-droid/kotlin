fun sumEven(vararg numbers: Int): Int {
  var sum=0
    for(number in numbers){
      if(number%2==0){
        sum+=number
        
      }
    }
    return sum
}
fun main(){
  println(sumEven(10, 15, 20, 7, 30))
}