/**
    - Pada Kotlin, ada operator extension function plus dan minus untuk collection.
    - Parameter pertama adalah collection, dan parameter selanjutnya dapat  collection atau element, dan akan menghasilkan
      collection baru.
    - Ketika melakukan penghapusan data collection/Map menggunakan extension function minus pada collection/Map, namun
      datanya tidak ada maka yang terjadi tidak ada data yang dihapus karena akan mengembalikan collection/Map itu sendiri.

    Plus & Minus Operators
      => plus(element)       => Untuk membuat collection baru dengan menambahkan element.
      => plus(collection)    => Untuk membuat collection baru dengan menambahkan collection.
      => minus(element)      => Untuk membuat collection baru dengan menghapus element.
      => minus(collection)   => Untuk membuat collection baru dengan menghapus collection.

    Plus & Minus Operators pada Map
      => plus(data Pair)     => Untuk membuat Map baru dengan menambahkan data pair.
      => plus(Map)           => Untuk membuat Map baru dengan menambahkan Map.
      => minus(key)          => Untuk membuat Map baru dengan menghapus key yang berupa Generic Parameter sehingga
                                dapat digantikan dengan tipe data apapun.
      => minus(keys: Iterable<K>)   => Untuk membuat Map baru dengan menghapus beberapa data key dalam bentuk
                                       Iterable generic sehingga dapat dimasukan datanya berupa collection dengan
                                       tipe data apapun.

 */

fun main() {
    val products1: Set<String> = setOf("Indomie", "Intermie", "Megah Mie")
    println(products1)
    println("= = = = = = = ")

    // menggunakan function plus(element)
        val products2: Set<String> = products1 + "Sari Roti"
        println(products2)
        println("= = = = = = = ")

    // menggunakan function plus(collection)
        val products3: Set<String> = products1 + setOf("Beng-Beng", "Oreo")
        println(products3)
        println("= = = = = = = ")

    // menggunakan function minus(element)
        val products4: Set<String> = products1 - "Megah Mie"
        println(products4)
        println("= = = = = = = ")

    // menggunakan function minus(collection)
        val products5: Set<String> = products1 - setOf("Megah Mie", "Intermie")
        println(products5)
        println("= = = = = = = ")

    // menggunakan function plus(data Pair) pada Map.
        val map1: Map<String, String> = mapOf("a" to "Ani", "b" to "Budi", "c" to "Citra")
        val map2: Map<String, String> = map1 + ("d" to "Dani")
        println(map2)
        println("= = = = = = = ")

    // menggunakan function plus(Map) pada Map.
        val map3: Map<String, String> = map1 + mapOf("e" to "Egi", "f" to "Fernando")
        println(map3)
        println("= = = = = = = ")

    // menggunakan function minus(key) pada Map
        val map4: Map<String, String> = map1 - ("c")
        println(map4)
        println("= = = = = = = ")

    // menggunakan function minus(keys: Iterable<K>) pada Map
        val map5: Map<String, String> = map1 - setOf("b","c")
        println(map5)
        println("= = = = = = = ")

}