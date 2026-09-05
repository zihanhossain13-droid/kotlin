fun maxForUser(name: String, vararg numbers: Int): String {
    var big=0
  for(number in numbers){
    if(number>big){
      big=number
    }
  }
  return "$name:$big"
}
fun main(){
  println(maxForUser("Zihan", 10, 50, 20, 80, 30))
}