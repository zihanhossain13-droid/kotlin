data class Employee(
  val name:String,
  val salary:Int,
  val department:String
)
fun main(){
  var employee=Employee(name="Zihan Hossain",salary=10000,department="CSE")
  var employee2=employee.copy(salary=70000)
  println(employee==employee2)
  println(employee===employee2)
  val(nam,salar,depart)=employee
  println(nam)
  println(salar)
  println(depart)
  val(nama,_,depatment)=employee2
  println(nama)
  println(depatment)
}