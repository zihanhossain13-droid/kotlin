fun groupEvenOdd(numbers:List<Int>):Map<Boolean,List<Int>>{
return numbers.groupBy{
    it%2==0
}
}
fun main(){
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val result=groupEvenOdd(numbers)
    println(result)
}