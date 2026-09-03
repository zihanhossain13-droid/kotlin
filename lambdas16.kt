fun main(){
  val checkResult:(Int)->String={
    val result=it+5
    if(result>=20)
    "Pass"
    else
    "Fail"

  }
  println(checkResult(20))
}