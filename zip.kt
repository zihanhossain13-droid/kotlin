fun combineData(
    names: List<String>,
    ages: List<Int>
): List<Pair<String, Int>> {
    return names.zip(ages)
}
fun main(){
  val names = listOf("Zihan", "Rahim", "Karim")
val ages = listOf(20, 25, 30)
val result=combineData(names,ages)
println(result)
}