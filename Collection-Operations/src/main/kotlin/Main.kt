/**
    - Kotlin sudah menyediakan berbagai macam operation yang bisa kita lakukan di collection.
    - Ada banyak sekali function bawaan collection yang digunakan sebagai operasi data collection.
    - Kotlin juga menyediakan operations tambahan berupa extension function.
    - Collection operations berupa extension function selalu menghasilkan collection baru, tanpa mengubah data pada
      collection sebelum-nya.
    - Oleh karena itu, collection operations pada Kotlin sangat aman ketika dilakukan operasi pada data collection
      karena tidak akan mengubah data collection aslinya.
    - Jenis Operations untuk data collections :
        - Transformation            => digunakan untuk melakukan tronsformasi(berubah bentuk) terhadap data collection.
                                       misal : data Int ke data String.
        - Filtering                 => digunakan untuk melakukan filtering atau seleksi terhadap data collection.
        - Plus, Minus Operators     => digunakan untuk melakukan operasi '+' dan '-' terhadap data collection.
        - Grouping                  => digunakan untuk melakukan pemisahan dalam group terhadap data collection.
        - Retrieving Collection parts => digunakan untuk mengambil sebagian data pada data collection.
        - Retrieving Single Elements  => digunakan untuk mengambil satu data pada data collection.
        - Ordering                  => digunakan untuk melakukan pengurutan data pada collection.
        - Aggregate operations      => digunakan untuk melakukan agregasi terhadap data yang ada pada collection.
    - Semua jenis extension function yang digunakan sebagai operasi data collection dapat digunakan pada interface
      Iterable dan turunannya seperti List, Set, MutableList, MutableSet, dll.

 */

fun main() {
    // Melakukan iterasi dengan function 'forEach' untuk mendapatkan value dari data collection.
    listOf<String>("Anto","Gabriel","Marcus").forEach{ println(it)}
    println("= = = = = = = =")

    // Melakukan iterasi dengan function 'forEachIndexed' untuk mendapatkan index/value dari data collection.
    mutableSetOf("Python" , "Golang", "Java", "Kotlin").forEachIndexed{ index, value ->
        println("$index = $value")
    }
}