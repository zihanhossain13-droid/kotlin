data class Student(
  var name:String,
  var age:Int,
  var department:String
)
fun main(){
  var output=Student(name="Zihan",age=24,department="CSE")
  println(output)
  var output2=output.copy(name="Zihan Hossain",age=25)
  println(output2)
}