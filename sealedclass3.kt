sealed class Result{
  class Success(val data:String):Result()
  class Error(val message:String):Result()
  class Loading:Result()
}
  fun main(){
    var result:Result=Result.Success("hi")
    when(result){
      is Result.Success->println("Data is Loaded Successfully")
      is Result.Error->println("Network Error")
      is Result.Loading->println("Please wait")
    }
  }
