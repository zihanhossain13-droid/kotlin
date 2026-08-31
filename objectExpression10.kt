interface Camera{
  fun takePhoto()
}
interface MusicPlayer{
  fun playmusic()
}
interface Internet{
  fun browser()
}
fun main(){
  val phone=object:Camera,MusicPlayer,Internet{
    override fun takePhoto(){
      println("Taking Photo")
    }
    override fun playmusic(){
      println("Playing music")
    }
    override fun browser(){
      println("Browser open")
    }
  }
  phone.takePhoto()
  phone.playmusic()
  phone.browser()
}