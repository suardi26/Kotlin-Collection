/**
    Fold & Reduce
    - Jika ingin membuat aggregate secara manual, maka dapat mengggunakan operator fold dan reduce.
    - Fold dan reduce merupakan operasi yang dilakukan pada element-element yang ada pada collection secara iterasi
      sequential dan mengembalikan hasil.
    - Hasil dari fold dan reduce akan digunakan untuk iterasi selanjutnya.

    Fold & Reduce Operator
        => reduce((R, T) -> R): R       => Pada iterasi pertama, R adalah element pertama, T adalah element selanjutnya.
                                           iterasi selanjutnya, R adalah hasil dari iterasi sebelumnya.
                                           ket : T adalah setiap element dari collection.
                                                 R adalah element pertama dari collection.
        => fold(R, (R,T) -> R): R       => fold sama dengan reduce, yang membedakan adalah fold memiliki inisial value
                                           R yang dapat kita masukan secara manual.
                                           ket : T adalah setiap element dari collection.
                                                 R adalah Initial value yang dapat diisi oleh tipe data yang berbeda
                                                   dengan data collection-nya.

        => reduceRight() & foldRight()          => sama seperti reduce() dan fold() namun dimulai dari element terakhir.
        => reduceIndexed() & foldIndexed()      => sama seperti reduce() dan fold() namun terdapat parameter index.
        => reduceRightIndexed() & foldRightIndexed() => sama seperti reduceIndexed() dan foldIndexed() namun dimulai dari
                                                        element akhir.
 */

fun main() {
    val list = (1..10).toList()
    println(list)
    // menggunakan function reduce((R, T) -> R): R
        val max: Int = list.reduce() {first, second ->
            if(first < second) second
            else first
        }
        println("nilai tertinggi : $max")

    // menggunakan function fold(R, (R,T) -> R): R
        val sum: Int = list.fold(0) {first, second ->
            first + second
        }
        println("Jumlah total nilai : $sum")
        println("= = = = = = = = = = = =")

    // contoh lain
        val products: List<String> = listOf("Beng-Beng", "Taro", "Oreo")
        val totalProduct: Int = products.fold(0) {first, second ->
            first + 1
        }
        println("Barang : ")
        products.forEach { value -> println(value)}
        println("Jumlah Barang : $totalProduct")

}