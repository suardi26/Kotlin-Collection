/**
    Slice Operator
    - Slice adalah operator yang digunakan untuk mengambil sebagian element yang ada pada collection yang sesuai
      dengan parameter range.
    - Slice Operator
        => slice(range)             => Digunakan untuk mengambil sebagian element yang ada pada collection sesuai
                                       dengan index range.
 */

fun main() {
    val list: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(list)
    println("= = = = = = = = =")

    // Menggunakan function slice(range) pada data List<Int>.
    val list2: List<Int> = list.slice(0..4)
    println(list2)
    println("= = = = = = = = =")
    val list3: List<Int> = list.slice(0..9 step 2)
    println(list3)
    println("= = = = = = = = =")

    // Menggunakan function slice(range) pada data List<String>
    val list4 = listOf("Satu", "Dua", "Tiga", "Empat", "Lima", "Enam")
    println(list4)
    println("= = = = = = = = =")
    val list5 = list4.slice(0..2)
    println(list5)
    println("= = = = = = = = =")
    val list6 = list4.slice(5 downTo 0 step 2)
    println(list6)

}