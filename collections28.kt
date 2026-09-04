fun increaseScores(scores: Map<String, Int>): Map<String, Int> {
    return scores.mapValues{
        it.value+10
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