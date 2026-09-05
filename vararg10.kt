fun countNumbers(vararg numbers: Int): String {
    var positive=0
  var negative=0
  var zero=0
  for(number in numbers){
    if(number>0){
      positive++
    }
    else if(number<0){
      negative++
    }
    else{
      zero++
    }
  }
  return "Positive:$positive Negative:$negative Zero:$zero"
}

fun main() {
    println(countNumbers(10, -5, 0, 20, -2, 0, 7))
}