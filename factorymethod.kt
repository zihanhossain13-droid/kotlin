class Book(
  var title:String,
  var price:Int){
    object BookFactory{
      fun createBook(title:String,price:Int):Book{
        return Book(title,price)
      }
    }

}
fun main(){
  val book=Book.BookFactory.createBook("Bangladesh",220)
  println(book.title)
  println(book.price)
}