data class Student(
    val name: String,
    val math: Int,
    val english: Int
)

fun checkResult(student: Student): String {
    return with(student){
      if(math>=40 && english>=40)
      "Pass"
      else
      "Fail"
    }
}
fun main(){
  val output=checkResult(Student("Zihan",80,80))
  println(output)
}