fun sumForUser(name: String, vararg numbers: Int): String {
  var i=0
  for(number in numbers){
    i+=number
  }
  return "$name:$i"
}
fun main()
{
  println(sumForUser("Zihan", 10, 20, 30))
}