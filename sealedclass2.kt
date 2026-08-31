sealed class Result{
  class Success:Result()
  class Error:Result()
  class Loading:Result()
}
  fun main(){
    var result:Result=Result.Success()
    when(result){
      is Result.Success->println("Success")
      is Result.Error->println("Error")
      is Result.Loading->println("Loading")
    }
  }
