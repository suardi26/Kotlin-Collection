/**
    - Grouping adalah operasi untuk melakukan grup terhadap element-element yang ada pada collection.

    Grouping Operators
       => groupBy((T) -> K) : Map<K, List<T>>       => Untuk menggabungkan collection menjadi group Map<K, List<T>>,
                                                       return valuenya adalah Map.
       => groupingBy((T) -> K) : Groupping<K, T>    => Untuk menggabungkan collection menjadi object Grouping<K,T>,
                                                       return valuenya adalah Object Grouping.

    - function groupingBy((T) -> K) yang digunakan untuk mengelompokan value yang sama dari collection
      menjadi beberapa data Collection dalam bentuk Grouping.
 */

fun main() {
    val list: List<String> = listOf("a", "b", "c", "a", "b", "c")
    var counter = 0

    // Menggunakan function groupBy((T) -> K) : Map<K, List<T>> yang digunakan untuk mengelompokan value yang sama dari
    // collection menjadi beberapa data List dalam bentuk Map.
    val map: Map<String, List<String>> = list.groupBy { value -> value}
    println(map)
    println("= = = = = = = =")
    val map2: Map<Int, List<String>> = list.groupBy { value -> value.length}
    println(map2)
    println("= = = = = = = =")

    // Menggunakan function groupingBy((T) -> K) yang digunakan untuk mengelompokan value yang sama dari collection
    // menjadi beberapa data Collection dalam bentuk Grouping.
    val grouping: Grouping<String, String> = list.groupingBy { value -> value }
    println(grouping)

}