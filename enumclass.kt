enum class TrafficLight{
  Red,
  Yellow,
  Green

}
fun main(){
  val light:TrafficLight=TrafficLight.Red
  when(light){
     TrafficLight.Red->println("Stop")
     TrafficLight.Yellow->println("Get Ready")
    TrafficLight.Green->println("GO")
  }
}