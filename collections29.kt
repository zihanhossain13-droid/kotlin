fun increaseScores(scores: Map<String, Int>): Map<String, Int> {
    return scores.mapKeys{
        "Student_${it.key}"
    }
}
fun main(){
    val scores = mapOf(
    "Zihan" to 80,
    "Rahim" to 70,
    "Karim" to 90
)
val result=increaseScores(scores)
println(result)
}