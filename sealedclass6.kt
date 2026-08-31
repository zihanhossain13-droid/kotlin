sealed class ApiResult{
  class Success(var data:String):ApiResult()
  class Error(var message:String):ApiResult()
  object Loading:ApiResult()
}
fun main(){
  var result=ApiResult.Loading
  when(result){
    is ApiResult.Success->println(result.data)
    is ApiResult.Error->println(result.message)
    is ApiResult.Loading->println("Please wait")
  }
}