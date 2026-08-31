enum class Priority{
  LOW,
  MEDIUM,
  HIGH
}
fun main(){
  val priority:Priority=Priority.HIGH
  println(priority.name)
  println(priority.ordinal)
}