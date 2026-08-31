sealed class Result
class Success:Result()
class Error:Result()
class Loading:Result()
fun main(){
  var result:Result=Success()
  when(result){
    is Success->println("Success")
    is Error->println("Error")
    is Loading->println("Loading")
  }
}