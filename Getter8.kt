class Employee(
var name:String,
val salary:Int,

){
  val salaryLevel:String
  get(){
    if(salary >= 100000){
      return "Senior Level"
    }
    else if(salary >= 50000){
      return "Mid Level"
    }
    else if(salary >= 20000){
    return "Junior Level"
    }
    return "Entry Level"
  }

}
fun main(){
  val p=Employee(name="Zihan",salary=10000)
  println(p.salaryLevel)
}