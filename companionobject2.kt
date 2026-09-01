class AppConfig{
  companion object{
    var AppName="MyApp"
    fun showAppName(){
      println(AppName)
    }
  }
}
fun main(){
  AppConfig.showAppName()
}