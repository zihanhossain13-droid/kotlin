fun total(vararg numbers: Int): Int {
    var total=0
  for(number in numbers){
  total+=number
}
return total
}
fun main(){
var v=total(40,20)
println(v)
}
