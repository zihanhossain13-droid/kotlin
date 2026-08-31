class Student(
var name:String,
var marks:Int
){
  val mark:String
  get(){
    if(marks in 90..100){
      return "getter theke 100"
    }
    else if(marks in 80..89){
      return "getter theke 80"
    }
    else if(marks in 70..79){
      return "getter theke 70"
    }
    else if(marks in 60..69){
      return "getter theke 60"
    }
    else if(marks in 50..59){
      return "getter theke 50"
    }
    return "getter theke 0"
  }

}
fun main(){
  val p=Student(name="Zihan",marks=80)
  println(p.mark)
}