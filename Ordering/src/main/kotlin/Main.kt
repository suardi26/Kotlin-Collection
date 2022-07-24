/**
    Ordering : Natural (automatis)
    - Kotlin juga mendukung operasi untuk mengurutkan data collection.
    - Interface Comparable digunakan untuk melakukan perbandingan 2 buah object, yang biasanya digunakan untuk mengurutkan
      data.
    - Secara default tipe data yang ada pada kotlin sudah memiliki Comparable(seperti Number, Char ataupun String).
      Oleh karena itu kita tidak perlu lagi membuat Comparable sendiri untuk mengurutkan data tersebut.

    Ordering Natural Operator
     => sorted()                => Untuk mengurutkan collection secara ascending.
     => SortedDescending()      => Untuk mengurutkan collection secara descending.

    Ordering : Custom
     - Selain menggunakan comparable bawaan kotlin, kita juga dapat membuat comparable sendiri.
     - Melakukan pengurutan secara custom dapat digunakan untuk mengurutkan data dengan tipe data yang dibuat sendiri.

    Ordering Custom Operator
     => sortedBy(selector: (T) -> R)            => Untuk mengurutkan collection secara ascending menggunakan selector.
                                                   Menggunakan comparable bawaan tipe data R.
     => sortedByDescending(selector: (T) -> R)  => Untuk mengurutkan collection secara descending menggunakan selector.
                                                   Menggunakan comparable bawaan tipe data R.
     => sortedWith(Comparator<T>)               => Untuk mengurutkan collection dengan Comparator<T>.

    - Kotlin juga menyediakan beberapa function untuk membuat comparable sederhana seperti compareBy, compareByDescending,
      ataupun dapat juga membuat Comparator sendiri.
 */

data class Product(val name: String, val qty: Int)

fun main() {
    // Ordering : Natural (automatis) sesuai Comparable bawaan tipe data di Kotlin.
        val numbers: List<Int> = listOf(1,2,3,4,5)
        val numbers1 = listOf(1,2,2,3,4,4,5)
        println("numbers : $numbers")
        println("numbers1 : $numbers1")

        // Menggunakan function sorted() mengurutkan data secara ascending.
        val asc: List<Int> = numbers.sorted()
        val asc1: List<Int> = numbers1.sorted()
        println("Ascending numbers : $asc")
        println("Ascending numbers1 : $asc1")

        // Menggunakan function sortedDescending() mengurutkan data secara descending.
        val desc: List<Int> = numbers.sortedDescending()
        val desc1: List<Int> = numbers1.sortedDescending()
        println("Descending numbers : $desc")
        println("Descending numbers1: $desc1")
        println("= = = = = = = =")

    // Ordering : Custom
        val products: List<Product> = listOf(
            Product("Daia", 5),
            Product("Rinso", 10),
            Product("Biore", 15)
        )

        // Menggunakan function sortedBy(selector: (T) -> R)
            // diurutkan secara ascending dari jumlah barang qty.
            val products1: List<Product> = products.sortedBy { objectP -> objectP.qty }
            println(products1)

        // Menggunakan function sortedByDescending(selector: (T) -> R)
            // diurutkan secara descending dari jumlah barang qty.
            val products2 : List<Product> = products.sortedByDescending { objectP -> objectP.qty }
            println(products2)

        // Menggunakan function sortedWith(Comparator<T>) dengan comparator yang dibuat sendiri.
            // diurutkan secara ascending dari jumlah barang qty dengan bantuan function compareBy()
            val products3 : List<Product> = products.sortedWith(compareBy{objectP -> objectP.qty})
            println(products3)

            // diurutkan secara descending dari jumlah barang qty dengan bantuan function compareByDescending()
            val products4 : List<Product> = products.sortedWith(compareByDescending{ objectP -> objectP.qty})
            println(products4)

            // diurutkan secara ascending dari jumlah barang qty dengan membuat Comparator sendiri dari
            // Interface Comparator.
            val products5: List<Product> = products.sortedWith(Comparator{objectA, objectB ->
                objectA.qty.compareTo(objectB.qty)
            })
            println(products5)

            // diurutkan secara ascending dari nama barang dengan bantuan function compareBy()
            val products6 : List<Product> = products.sortedWith(compareBy{objectP -> objectP.name})
            println(products6)

}