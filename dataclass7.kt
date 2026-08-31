data class Student(
  var name:String,
  var age:Int,
  var department:String
)
fun main(){
  var student=Student(name="Zihan Hossain",age=23,department="CSE")
  val (name,age,department)=student
  println(name)
  println(age)
  println(department)
}