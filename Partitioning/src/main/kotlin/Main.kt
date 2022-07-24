/**
    Filtering : Partitioning
    - Pada filtering by predicate, kita akan menghilangkan data yang tidak masuk kondisi filter.
    - Dengan filtering partitioning, kita akan membagi collection menjadi 2, dimana collection pertama yang masuk
      filtering, dan collection kedua yang tidak masuk filtering.

    Filtering : Partitioning Operation
    - Partitioning Operation                                    Ket
      partition((T) -> Boolean): Pair<List<T>, List<T>>    =>   Mempartisi collection dengan filtering sehingga
                                                                menghasilkan Pair, data pertama collection T yang masuk
                                                                filter, dan data kedua collection T yang tidak masuk
                                                                filter.
 */
fun main() {
    // Menggunakan function partition untuk membagi data collection menjadi 2 bagian dan mengembalikan return value
    // data Pair<List<T>, List<T>>
    val list: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    val partition: Pair<List<Int>, List<Int>> = list.partition { value -> value % 2 == 0 }
    val (genap, ganjil) = partition

    println(list)
    println("= = = = = = = = =")
    println(genap)
    println("= = = = = = = = =")
    println(ganjil)
}