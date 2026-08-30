class User(
name:String,
age:Int
){
  var newName:String=name
  set(value){
    if(value.isEmpty()){
      println("Invalid Username")
    }else if(value.length<3){
      println("Username too short")

    }
    else{
      field=value
      println("Username is Updated")
    }
  }
  var newAge:Int=age
  set(value){
    if(value<0 || value>100){
      println("Invalid Age")
    }else{
      field=value
      println("Age is Updated")
    }
  }

}
fun main(){
  var p=User(name="Zihan",age=22)
  p.newName="Hossain"
  println(p.newName)
  p.newAge=24
  
  println(p.newAge)
}