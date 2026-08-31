data class Student(
  var name:String,
  var age:Int,
  var department:String
)
fun main(){
  var student=Student(name="Zihan",age=23,department="CSE")
  println(student)
  var student2=student.copy(name="Hossain")
  student2.age=30
  println(student2)
}