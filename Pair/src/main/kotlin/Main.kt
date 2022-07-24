/**
    - Pair adalah representasi dari data yang berpasangan.
    - Pada Structur data Map, Pair digunakan sebagai data Map ketika pertama kali Map dibuat.
    - Pada saat membuat data Map maka kita akan memasukan data dalam bentuk Pair namun nanti ketika jadi di dalam Map
      maka data-nya akan menjadi entry.
    - Pair adalah data class.
 */

fun main() {
    // Membuat object dari data class Pair.
    val pair: Pair<String, Int> = Pair("Suardi", 26)
    println(pair.first)
    println(pair.second)
    println("= = = = = = = = = = = ")

    // Dapat juga menggunakan function infix notation 'to', yang secara otomatis value-nya akan di convert menjadi Pair.
    val pair2: Pair<String, Int> = "Doni" to 29
    println(pair2.first)
    println(pair2.second)
}