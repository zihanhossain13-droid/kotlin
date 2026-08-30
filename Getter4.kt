class Student(
var name:String,
marks:Int
){
    var newMarks:Int=marks
    get(){
        if(field in 90..100){
            println("A+")
        }
        else if(field in 80..89){
            println("A")
        }
        else if(field in 70..79){
            println("B")
        }
        else if(field in 60..69){
            println("C")
        }
        else if(field in 50..59){
            println("D")
        }
        else if(field in 0..49){
            println("Fail")
        }
        return field
    }

}
fun main(){
    var p=Student(name="Zihan",marks=40)
    println(p.newMarks)
}