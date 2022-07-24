/**
    Filtering : Testing
    - Filtering testing adalah operation yang dapat digunakan untuk melakukan pengecekan isi data dari collection.
    - Hasil dari filtering testing adalah boolean, dimana true jika sesuai kondisi, dan false jika tidak sesuai kondisi.

    Filtering Operation
    - Testing Operation                         Keterangan
      => any((T) -> Boolean): Boolean    ->     Untuk melakukan pengecekan apakah minimal ada satu data sesuai dengan
                                                kondisi.

      => none((T) -> Boolean): Boolean   ->     Untuk melakukan pengecekan apakah tidak ada satupun data sesuai dengan
                                                kondisi.

      => all((T) -> Boolean): Boolean    ->     Untuk melakukan pengecekan apakah semua data sesuai dengan kondisi.

      => any()                           ->     Untuk melakukan pengecekan apakah data collection memiliki data.

      => none()                          ->     Untuk melakukan pengecekan apakah data collection tidak punya data.
 */
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    println(list)
    println("= = = = = = = = =")

    // Menggunakan function any((T) -> Boolean): Boolean
        val test1: Boolean = list.any { value -> value % 2 == 0 }
        println("Apakah ada data dengan angka Genap : $test1")

    // Menggunakan function none((T) -> Boolean): Boolean
        val test2: Boolean = list.none { value -> value % 2 == 0 }
        println("Apakah tidak ada data dengan angka Genap : $test2")

    // Menggunakan function all((T) -> Boolean): Boolean
        val test3: Boolean = list.all { value -> value % 2 == 0 }
        println("Apakah semua data adalah angka Genap : $test3")

    // Menggunakan function any()
        val test4: Boolean = list.any() // sama saja dengan list.isNotEmpty()
        println("Apakah Data Collection diatas memiliki data : $test4")

    // Menggunakan function none()
        val test5: Boolean = list.none() // sama saja dengan list.isEmpty()
        println("Apakah Data Collection diatas tidak memiliki data: $test5")

}