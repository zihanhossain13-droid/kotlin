class Student(
var name:String,
age:Int
){
  var Studentage:Int=age
  set(newAge:Int){
    if(newAge<0 || newAge>100){
      println("Invalid")
    }else{
      field=newAge
      println("Age Updated")
    }

  }
}
fun main(){
var p=Student(name="Zihan",age=23)
p.Studentage=25
println(p.Studentage)
}