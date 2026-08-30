abstract class Employee(
var name:String,
private var salary:Int
){
  fun accessSalary(){
    println(salary)
  }
  fun salaryUpdate(newSalary:Int){
    if(newSalary>0){
      salary=newSalary
    }else{
      println("Invalid")
    }
  }
  fun increaseSalary(percent:Int){
    if(percent>0){
    salary+=salary*percent/100
    }else{
      println("Invalid")
    }


  }
  abstract fun output()


}
class Developer(name:String,salary:Int,var language:String):Employee(name,salary){
  override fun output(){
    println(name)
    println(language)
    accessSalary()
  }

}
class Manager(name:String,salary:Int,var teamSize:Int):Employee(name,salary){
override fun output(){
  println(name)
  println(teamSize)
  accessSalary()
}
}
fun main(){
  var p:Employee=Developer(name="Zihan",salary=200,language="Kotlin")
  p.output()
  p=Manager(name="Hossain",salary=340,teamSize=5)
  p.output()
  p.increaseSalary(50)
  p.output()
}