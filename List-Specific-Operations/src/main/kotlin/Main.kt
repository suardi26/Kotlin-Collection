/**
    - Pada Kotlin ada banyak operasi yang khusus dibuat untuk List.
    - List Specific Operator
        -> getOrElse(index, (index, (index) -> T)   => Untuk mengambil element pada index, jika tidak ada, mengembalikan
                                                       Nilai lambda.
        -> getOrNull(index)                         => Untuk mengambil element pada index, jika tidak ada, mengembalikan
                                                       null.
        -> subList(from, to)                        => Untuk mengambil semua element dari from (inclusive) ke to
                                                       (exclusive).
                                                        ket :
                                                              from (inclusive) -> index awal.
                                                              to (exclusive) -> Berapa banyak element yang akan diambil.
        -> binarySearch(value)                      => Untuk melakukan pencarian menggunakan algoritma binary search.

        -> indexOf(value)                           => Untuk mengambil index element yang sama dengan value, karena
                                                       List bisa dupikat.
        -> lastIndexOf(value)                        => Untuk mengambil index element terakhir yang sama dengan value,
                                                       karena List bisa duplikat.
        -> indexOfFirst((T) -> Boolean)             => Untuk mengambil index element yang sama dengan kondisi.
        -> indexOfLast((T) -> Boolean)              => Untuk mengambil index element terakhir yang sama dengan kondisi.
    - Function-function diatas rata-rata adalah extension function.

 */

fun main() {
    // data List
    val list = listOf("Suardi", "Daud", "Manda", "Kotlin")
    println(list)

    // menggunakan function getOrElse(index, (index, (index) -> T)
        val name1: String = list.getOrElse(0){ value -> "Element Tidak Ada"  }
        val name2: String = list.getOrElse(6){ value -> "Element Tidak Ada"  }
        println("index ke0 : $name1")
        println("index ke6 : $name2")

    // menggunakan function getOrNull(index)
        val name3: String? = list.getOrNull(1)
        val name4: String? = list.getOrNull(7)
        println("index ke1 : $name3")
        println("index ke7 : $name4")

    // menggunakan function subList(from, to)
        // Mengambil data dari index ke0 sebanyak 2 data
        val names1: List<String> = list.subList(0, 2)
        println("Mengambil data dari index ke0 sebanyak 2 data : $names1")

        // Mengambil data dari index ke0 sebanyak 3 data
        val names2: List<String> = list.subList(0, 3)
        println("Mengambil data dari index ke0 sebanyak 3 data : $names2")

    // menggunakan function binarySearch(value)
        // Pengurutan data
        val sortedList: List<String> = list.sorted()
        println("Mengurutkan data sesuai abjad : $sortedList")

        // melakukan pencarian data menggunakan algoritma binary search
        val name5: Int = sortedList.binarySearch("Kotlin") //  [Daud, Kotlin, Manda, Suardi]
        println("pencarian index menggunakan algoritma binary search. element = Kotlin, index = $name5 ")
        println("= = = = = = = =")

    // menggunakan function indexOf(value)
        val products: List<String> = listOf("Antangin", "Antangin", "Bodrex", "Bodrex", "Bodrex", "Decolgen", "Decolgen")
        println(products)
        val index1: Int = products.indexOf("Bodrex")
        println("mencari index pertama dari value yang sama yaitu Bodrex : $index1")

    // menggunakan function lasIndexOf(value)
        val index2: Int = products.lastIndexOf("Bodrex")
        println("mencari index terakhir dari value yang sama yaitu Bodrex : $index2")

    // menggunakan function indexOfFirst((T) -> Boolean)
        val index3: Int = products.indexOfFirst { element -> element == "Decolgen" }
        println("mencari index pertama dari value yang sama yaitu Decolgen : $index3")

    // menggunakan function indexOfLast((T) -> Boolean)
        val index4: Int = products.indexOfLast { element -> element == "Decolgen" }
        println("mencari index terakhir dari value yang sama yaitu Decolgen : $index4")
}