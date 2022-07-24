/**
    - Kotlin juga mendukung operasi untuk mengambil element secara random didalam collection.

    Retrieve Single Element by Position.
        => random()                                 => Digunakan untuk mengambil element/value secara random.

 */
fun main() {
    val set: Set<Int> = (1..50).toSet()

    // Menggunakan function random()
    val number1: Int = set.random()
    println(number1)
    println(set.random())
    println(set.random())
    println(set.random())
}