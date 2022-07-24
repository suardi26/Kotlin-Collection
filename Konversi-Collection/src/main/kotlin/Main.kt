/**
    - Pada Kotlin kita dapat melakukan konversi collection ke jenis collection lain secara mudah.
    - Misal kita ingin mengubah dari array ke list, atau dari range ke set, atau dari set ke list, dapat dengan mudah
      dilakukan.
    - Semua function yang digunakan untuk mengkonversi collection dimulai dengan keyword "to", misal toList, toSet,
      toMutableList, dan lain-lain.

 */

fun main(){
    val array = arrayOf(1, 2, 3, 4, 5)
    val range = 1..100

    // mengkonversi dari data range ke data List
    val list = range.toList()

    // mengkonversi dari data array ke data Set
    val set1 = array.toSet()

    // mengkonversi dari data array ke data MutableList
    val mutableList = array.toMutableList()

    // mengkonversi dari data List ke data Set
    val set = list.toSet()

    // mengkonversi dari data List ke data MutableSet
    val mutableSet = list.toMutableSet()

    // mengkonversi dari data List ke data SortedSet
    // SortedSet dijadikan Set tapi value-nya di urutkan.
    val sortedSet = list.toSortedSet()
}