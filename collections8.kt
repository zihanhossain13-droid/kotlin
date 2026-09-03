fun greetNames(names: List<String>,operation:(String)->String): List<String> {
    return names.map(operation)
}
fun main(){
 val names = listOf("Zihan", "Rahim", "Karim", "Mahfuz")
 val result=greetNames(names){
  "Hello $it"
 }
  println(result)
}