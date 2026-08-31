sealed class ApiResult{
  class Success(val data:String):ApiResult()
  class Error(val message:String):ApiResult()
  class Loading:ApiResult()
}
fun main(){
  var result:ApiResult=ApiResult.Success("Hello")
   when(result){
    is ApiResult.Success->println(result.data)
    is ApiResult.Error->println(result.message)
    is ApiResult.Loading->println("Please Wait")
  }
}