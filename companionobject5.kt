class AppConfig{
  companion object{
    const val App_Name="MyApp"
    const val version=1
  }
}
fun main(){
  println(AppConfig.App_Name)
  println(AppConfig.version)
}