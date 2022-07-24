/**
    - Pada Kotlin, kita dapat mendapatkan collection dengan urutan data terbalik dari data aslinya.

    Ordering Reverse Operator
        => reversed()           => Untuk membuat data collection baru dengan urutan terbalik dari collection aslinya.
        => asReversed()         => Untuk membuat view terhadap collectian dengan urutan terbalik, jika collection
                                   aslinya berubah, view pun akan ikut berubah.
 */

fun main() {
    // Menggunakan function reversed()
        val list: MutableList<String> = mutableListOf("Andi", "Budi", "Caca")
        println("data list : $list")
        val listReverse = list.reversed()
        println("data listReverse : $listReverse")

        // mengubah data list
        list[2] = "Citra"
        println("Mengubah data list : $list")
        println("data listReverse : $listReverse")
        println("= = = = = = = = = = = =")

    // Menggunakan function asReversed()
        val list2: MutableList<String> = mutableListOf("Apel", "Belimbing", "Coklat")
        println("data list2 : $list2")
        val listAsReverse = list2.asReversed()
        println("data listAsReverse : $listAsReverse")

        // mengubah data list2 maka data listAsReverse akan berubah juga mengikuti list2 karena menggunakan
        // function asReversed().
        list2[2] = "Ceri"
        println("mengubah data list2 : $list2")
        println("data listAsReverse : $listAsReverse")
        println("= = = = = = = = = = = =")
}
