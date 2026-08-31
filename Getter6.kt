
class Product(
    var name: String,
    var price: Int,
    var quantity: Int
) {

    val totalPrice: Int
        get() {
            val total = price * quantity

            if (total >= 50000) {
                println("Expensive Order")
            } else {
                println("Affordable Order")
            }

            return total
        }
}

fun main() {

    val p = Product(
        name = "Laptop",
        price = 20000,
        quantity = 3
    )

    println(p.totalPrice)
}
