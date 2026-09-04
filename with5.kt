data class Student(
    val name: String,
    val math: Int,
    val english: Int
)

fun getResult(student: Student): String {
  return with(student){
    "Zihan: ${math+english},Average=${(math+english)/2.0}"
  }
}
fun main(){
  var with=getResult(Student("Zihan",80,80))
  println(with)
}