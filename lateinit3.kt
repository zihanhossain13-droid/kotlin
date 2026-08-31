class Employee{
  lateinit var name:String
  lateinit var department:String
  fun showInfo(){
    println(name)
    println(department)
  }
}
fun main(){
  var p=Employee()
  p.name="Zihan Hossain"
  p.department="CSE"
  p.showInfo()
}