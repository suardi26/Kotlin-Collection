/**
    Ordering Random
    - Pada Kotlin, kita juga dapat mengacak posisi element di collection.

    Ordering Random Operator
    - shuffled()                => Untuk membuat collection baru dengan posisi element random.
 */
fun main() {
    // Menggunakan function shuffled()
    val list = (1..10).toList()
    println(list)
    println(list.shuffled())
    println(list.shuffled())
    println(list.shuffled())

}