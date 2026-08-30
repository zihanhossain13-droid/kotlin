class Employee(
var name:String,
salary:Int
){
  var newSalary:Int=salary
  set(value){
    if(value<0){
      println("Invalid Salary")
    }
    else if(value==0){
      println("Salary can't be zero")
    }
    else if(value>=1 && value<=10000){
      println("Salary too low")
    }
    else{
      field=value
      println("Salary Updated")
    }
  }

}
fun main(){
  var p=Employee(name="Zihan",salary=1000000)
  p.newSalary=5000000
  println(p.newSalary)
}