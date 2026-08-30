class Student(
  var name:String,
  marks:Int
){
  var newMarks:Int=marks
  get(){
    if(field>=80){
      println("Excellent")
    }
      return field
    }
  }
fun main(){
  var p=Student(name="Zihan",marks=90)
  println(p.newMarks)
}