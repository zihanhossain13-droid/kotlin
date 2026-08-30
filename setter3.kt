class Student(
var name:String,
mark:Int
){
  var newMark:Int=mark
  set(newMark){
    if(newMark<0 || newMark>100){
      println("Invalid Marks")
    }else{
      field=newMark
      println("Mark Updated")
    }

  }

}
fun main(){
  var p=Student(name="Zihan",mark=50)
  p.newMark=80
  println(p.newMark)
}